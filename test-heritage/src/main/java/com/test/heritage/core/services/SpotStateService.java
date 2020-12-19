package com.test.heritage.core.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.heritage.core.entities.position.IndoorPosition;
import com.test.heritage.core.entities.position.OutdoorPosition;
import com.test.heritage.core.entities.spotstate.IndoorRepairSpotState;
import com.test.heritage.core.entities.spotstate.OutdoorRepairSpotState;
import com.test.heritage.core.entities.spotstate.RepairSpotState;
import com.test.heritage.core.entities.spotstate.SpotState;
import com.test.heritage.core.repositories.PositionRepositoryInterface;
import com.test.heritage.core.repositories.SpotStateRepositoryInterface;

@Service
public class SpotStateService implements SpotStateServiceInterface {

	@Autowired
	private SpotStateRepositoryInterface	spotStateRepository;

	@Autowired
	private PositionRepositoryInterface		positionRepository;

	public SpotStateRepositoryInterface getSpotStateRepository() {
		return spotStateRepository;
	}

	public void setSpotStateRepository( SpotStateRepositoryInterface spotStateRepository ) {
		this.spotStateRepository = spotStateRepository;
	}

	@Override
	public Iterable<SpotState> getAllSpotStates() {
		return spotStateRepository.findAll();
	}

	@Override
	@Transactional
	public SpotState save( SpotState sst ) {
		if ( sst instanceof RepairSpotState ) {
			RepairSpotState rss = (RepairSpotState) sst;
			if ( rss.getPosition() != null ) {
				/* Vérification que la position appliquée à la réparation est bien 
				 * dans le même contexte que la réparation elle meme (indoor/outdoor)
				 * Si non vérifié, lance une IllegalStateException
				 */
				if ( rss instanceof OutdoorRepairSpotState && !( rss.getPosition() instanceof OutdoorPosition ) ||
				        rss instanceof IndoorRepairSpotState && !( rss.getPosition() instanceof IndoorPosition ) ) {
					throw new IllegalStateException(
					        rss.getClass().getSimpleName() + " cannot be associated with an "
					                + rss.getPosition().getClass().getSimpleName() );
				}
				if ( rss.getPosition().getId() == null ) {
					positionRepository.save( rss.getPosition() );
				}
			}
		}
		return spotStateRepository.save( sst );
	}

}

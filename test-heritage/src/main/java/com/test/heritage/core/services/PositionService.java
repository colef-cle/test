package com.test.heritage.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.heritage.core.entities.position.Position;
import com.test.heritage.core.repositories.PositionRepositoryInterface;

@Service
public class PositionService implements PositionServiceInterface {

	@Autowired
	private PositionRepositoryInterface positionRepository;

	@Override
	public Iterable<Position> getAllPositions() {
		return positionRepository.findAll();
	}

}

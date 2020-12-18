package com.test.heritage.core.entities.spotstate;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;

import com.test.heritage.core.entities.position.Position;

@Entity
@SecondaryTable( name = RepairSpotState.TABLE_NAME, pkJoinColumns = @PrimaryKeyJoinColumn( name = "rss_id" ) )
public class IndoorRepairSpotState extends RepairSpotState {

	/**
	 * 
	 */
	public IndoorRepairSpotState() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param description
	 * @param interValidation
	 * @param customerCanSee
	 * @param needMonitoring
	 * @param radialPosition
	 * @param warranted
	 * @param endOfWarranty
	 * @param toBeHlpMonitored
	 * @param efficiency
	 * @param position
	 */
	public IndoorRepairSpotState( Integer id, String description, Boolean interValidation, Boolean customerCanSee,
	        Boolean needMonitoring, Short radialPosition, Boolean warranted, Date endOfWarranty,
	        Boolean toBeHlpMonitored, RepairEfficiency efficiency, Position position ) {
		super( id, description, interValidation, customerCanSee, needMonitoring, radialPosition, warranted,
		        endOfWarranty,
		        toBeHlpMonitored, efficiency, position );
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param description
	 * @param interValidation
	 * @param customerCanSee
	 * @param needMonitoring
	 * @param radialPosition
	 * @param warranted
	 * @param endOfWarranty
	 * @param toBeHlpMonitored
	 * @param efficiency
	 * @param position
	 */
	public IndoorRepairSpotState( String description, Boolean interValidation, Boolean customerCanSee,
	        Boolean needMonitoring, Short radialPosition, Boolean warranted, Date endOfWarranty,
	        Boolean toBeHlpMonitored, RepairEfficiency efficiency, Position position ) {
		super( description, interValidation, customerCanSee, needMonitoring, radialPosition, warranted, endOfWarranty,
		        toBeHlpMonitored, efficiency, position );
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IndoorRepairSpotState [id=" + id + ", description=" + description + ", interValidation="
		        + interValidation + ", customerCanSee=" + customerCanSee + ", needMonitoring=" + needMonitoring
		        + ", radialPosition=" + radialPosition + ", warranted=" + warranted + ", endOfWarranty=" + endOfWarranty
		        + ", toBeHlpMonitored=" + toBeHlpMonitored + ", efficiency=" + efficiency + ", position=" + position
		        + "]";
	}

}

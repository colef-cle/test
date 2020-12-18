package com.test.heritage.core.entities.spotstate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.test.heritage.core.entities.position.Position;

@Entity
@SecondaryTable( name = RepairSpotState.TABLE_NAME, pkJoinColumns = @PrimaryKeyJoinColumn( name = "rss_id" ) )
public class RepairSpotState extends SpotState {

	public final static String	TABLE_NAME	= "repairspotstate_rss";

	@Column( table = TABLE_NAME, name = "rss_radial_position" )
	protected Short				radialPosition;

	@Column( table = TABLE_NAME, name = "rss_warranted", nullable = false )
	protected Boolean			warranted;

	@Column( table = TABLE_NAME, name = "rss_end_of_warranty" )
	@Temporal( value = TemporalType.DATE )
	protected Date				endOfWarranty;

	@Column( table = TABLE_NAME, name = "rss_to_be_hlp_monitored", nullable = false )
	protected Boolean			toBeHlpMonitored;

	@Column( table = TABLE_NAME, name = "rss_efficiency" )
	@Enumerated( EnumType.STRING )
	protected RepairEfficiency	efficiency;

	@ManyToOne
	@JoinColumn( table = TABLE_NAME, name = "rss_pos_id" )
	protected Position			position;

	/**
	 * Bean norm
	 */
	public RepairSpotState() {
		super();
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
	public RepairSpotState( String description, Boolean interValidation, Boolean customerCanSee, Boolean needMonitoring,
	        Short radialPosition, Boolean warranted, Date endOfWarranty, Boolean toBeHlpMonitored,
	        RepairEfficiency efficiency, Position position ) {
		super( description, interValidation, customerCanSee, needMonitoring );
		this.radialPosition = radialPosition;
		this.warranted = warranted;
		this.endOfWarranty = endOfWarranty;
		this.toBeHlpMonitored = toBeHlpMonitored;
		this.efficiency = efficiency;
		this.position = position;
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
	public RepairSpotState( Integer id, String description, Boolean interValidation, Boolean customerCanSee,
	        Boolean needMonitoring, Short radialPosition, Boolean warranted, Date endOfWarranty,
	        Boolean toBeHlpMonitored, RepairEfficiency efficiency, Position position ) {
		super( id, description, interValidation, customerCanSee, needMonitoring );
		this.radialPosition = radialPosition;
		this.warranted = warranted;
		this.endOfWarranty = endOfWarranty;
		this.toBeHlpMonitored = toBeHlpMonitored;
		this.efficiency = efficiency;
		this.position = position;
	}

	@Override
	public String toString() {
		return "RepairSpotState [id=" + id + ", description=" + description + ", interValidation=" + interValidation
		        + ", customerCanSee=" + customerCanSee + ", needMonitoring=" + needMonitoring + ", radialPosition="
		        + radialPosition + ", warranted=" + warranted + ", endOfWarranty=" + endOfWarranty
		        + ", toBeHlpMonitored=" + toBeHlpMonitored + ", efficiency=" + efficiency + ", position=" + position
		        + "]";
	}

	/**
	 * @return the radialPosition
	 */
	public Short getRadialPosition() {
		return radialPosition;
	}

	/**
	 * @param radialPosition
	 *            the radialPosition to set
	 */
	public void setRadialPosition( Short radialPosition ) {
		this.radialPosition = radialPosition;
	}

	/**
	 * @return the warranted
	 */
	public Boolean getWarranted() {
		return warranted;
	}

	/**
	 * @param warranted
	 *            the warranted to set
	 */
	public void setWarranted( Boolean warranted ) {
		this.warranted = warranted;
	}

	/**
	 * @return the endOfWarranty
	 */
	public Date getEndOfWarranty() {
		return endOfWarranty;
	}

	/**
	 * @param endOfWarranty
	 *            the endOfWarranty to set
	 */
	public void setEndOfWarranty( Date endOfWarranty ) {
		this.endOfWarranty = endOfWarranty;
	}

	/**
	 * @return the toBeHlpMonitored
	 */
	public Boolean getToBeHlpMonitored() {
		return toBeHlpMonitored;
	}

	/**
	 * @param toBeHlpMonitored
	 *            the toBeHlpMonitored to set
	 */
	public void setToBeHlpMonitored( Boolean toBeHlpMonitored ) {
		this.toBeHlpMonitored = toBeHlpMonitored;
	}

	/**
	 * @return the efficiency
	 */
	public RepairEfficiency getEfficiency() {
		return efficiency;
	}

	/**
	 * @param efficiency
	 *            the efficiency to set
	 */
	public void setEfficiency( RepairEfficiency efficiency ) {
		this.efficiency = efficiency;
	}

	/**
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition( Position position ) {
		this.position = position;
	}

}

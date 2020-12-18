package com.test.heritage.core.entities.spotstate;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.test.heritage.core.entities.position.IndoorPosition;
import com.test.heritage.core.entities.position.OutdoorPosition;
import com.test.heritage.core.entities.position.Position;

@Entity
@Table( name = SpotState.TABLE_NAME )
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "sst_inheritance_type", discriminatorType = DiscriminatorType.STRING )
public class SpotState {

	public final static String	TABLE_NAME	= "spotstate_sst";

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "sst_id" )
	protected Integer			id;
	@Column( name = "sst_description" )
	protected String			description;
	@Column( name = "sst_intern_validation", nullable = true )
	protected Boolean			interValidation;
	@Column( name = "sst_customer_can_see", nullable = true )
	protected Boolean			customerCanSee;
	@Column( name = "sst_need_monitoring", nullable = true )
	protected Boolean			needMonitoring;

	@Transient
	Position[]					positions	= new Position[] { new IndoorPosition( 156, "Position dans ton cul haha" ),
	                                                           new OutdoorPosition( 489, "Tien prend ca" ) };

	@Override
	public String toString() {
		return "SpotState [id=" + id + ", description=" + description + ", interValidation=" + interValidation
		        + ", customerCanSee=" + customerCanSee + ", needMonitoring=" + needMonitoring + ", positions="
		        + Arrays.toString( positions ) + "]";
	}

	/**
	 * Default constructor for bean norm
	 */
	public SpotState() {
		super();
	}

	/**
	 * @param description
	 * @param interValidation
	 * @param customerCanSee
	 * @param needMonitoring
	 */
	public SpotState( String description, Boolean interValidation, Boolean customerCanSee, Boolean needMonitoring ) {
		super();
		this.description = description;
		this.interValidation = interValidation;
		this.customerCanSee = customerCanSee;
		this.needMonitoring = needMonitoring;
	}

	/**
	 * @param id
	 * @param description
	 * @param interValidation
	 * @param customerCanSee
	 * @param needMonitoring
	 */
	public SpotState( Integer id, String description, Boolean interValidation, Boolean customerCanSee,
	        Boolean needMonitoring ) {
		super();
		this.id = id;
		this.description = description;
		this.interValidation = interValidation;
		this.customerCanSee = customerCanSee;
		this.needMonitoring = needMonitoring;
	}

	public Integer getId() {
		return id;
	}

	public void setId( Integer id ) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription( String description ) {
		this.description = description;
	}

	public Boolean getInterValidation() {
		return interValidation;
	}

	public void setInterValidation( Boolean interValidation ) {
		this.interValidation = interValidation;
	}

	public Boolean getCustomerCanSee() {
		return customerCanSee;
	}

	public void setCustomerCanSee( Boolean customerCanSee ) {
		this.customerCanSee = customerCanSee;
	}

	public Boolean getNeedMonitoring() {
		return needMonitoring;
	}

	public void setNeedMonitoring( Boolean needMonitoring ) {
		this.needMonitoring = needMonitoring;
	}

}

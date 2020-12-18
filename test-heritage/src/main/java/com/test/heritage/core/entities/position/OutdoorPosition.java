package com.test.heritage.core.entities.position;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( "OUT" )
public class OutdoorPosition extends Position {

	/**
	 * 
	 */
	public OutdoorPosition() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param alias
	 */
	public OutdoorPosition( Integer id, String alias ) {
		super( id, alias );
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param alias
	 */
	public OutdoorPosition( String alias ) {
		super( alias );
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OutdoorPosition [id=" + id + ", alias=" + alias + "]";
	}

}

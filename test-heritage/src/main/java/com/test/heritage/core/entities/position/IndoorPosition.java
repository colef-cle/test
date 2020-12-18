package com.test.heritage.core.entities.position;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( "IN" )
public class IndoorPosition extends Position {

	/**
	 * 
	 */
	public IndoorPosition() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param alias
	 */
	public IndoorPosition( Integer id, String alias ) {
		super( id, alias );
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param alias
	 */
	public IndoorPosition( String alias ) {
		super( alias );
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IndoorPosition [id=" + id + ", alias=" + alias + "]";
	}

}

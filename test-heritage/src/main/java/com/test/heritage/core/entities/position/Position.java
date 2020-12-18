package com.test.heritage.core.entities.position;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "pos_in_out" )
@Table( name = "position_pos" )
public abstract class Position {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "pos_id" )
	protected Integer	id;
	@Column( name = "pos_alias" )
	protected String	alias;

	/**
	 * Bean norm
	 */
	public Position() {
		super();
	}

	/**
	 * @param alias
	 */
	public Position( String alias ) {
		super();
		this.alias = alias;
	}

	/**
	 * @param id
	 * @param alias
	 */
	public Position( Integer id, String alias ) {
		super();
		this.id = id;
		this.alias = alias;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", alias=" + alias + "]";
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId( Integer id ) {
		this.id = id;
	}

	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias
	 *            the alias to set
	 */
	public void setAlias( String alias ) {
		this.alias = alias;
	}

}

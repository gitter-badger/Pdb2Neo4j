package org.wallerlab.domain;

import org.neo4j.ogm.annotation.*;

/**
 * This domain model is for an atom of a PDBml file.
 *
 * Is set as a neo4j entity.
 * 
 * @author Christian Ouali Turki
 *
 */
@NodeEntity
public class Atom {

	@GraphId
	private Long id;

	private String element;

	private Double x;

	private  Double y;

	private  Double z;

	private String resId;

	private String chain;

	private String group;

	public Atom(String element, Double x,Double y, Double z, String resId,String chain, String group) {
		this.element = element;
		this.x = x;
		this.y = y;
		this.z = z;
		this.resId = resId;
		this.chain = chain;
		this.group = group;
	}

	public Long getId() {
		return id;
	}

	public String getElement() {
		return element;
	}

	public Double getX() {
		return x;
	}

	public Double getY() {
		return y;
	}

	public Double getZ() {
		return z;
	}

	public String getResId() {
		return resId;
	}

	public String getChain() {
		return chain;
	}

	public String getGroup() {
		return group;
	}

	@Override
	public String toString() {
		return "Atom{" +
				"id=" + id +
				", element='" + element + '\'' +
				", x=" + x +
				", y=" + y +
				", z=" + z +
				", resId='" + resId + '\'' +
				", chain='" + chain + '\'' +
				", group='" + group + '\'' +
				'}';
	}
}

package org.wallerlab.domain;

import java.util.Set;
import org.neo4j.ogm.annotation.*;

/**
 * This domain model is adjusted a molecule of a pdbml file. Is set as
 * a neo4j entity.
 * 
 * @author Christian Ouali Turki
 *
 */
@NodeEntity
public class Molecule {

	@GraphId
	private Long id;
	
	private final String name;

	public final Integer atomCount;
	
	/*
	 * Set of atoms. @Relationship enables the relation between two domain models.
	 */
	@Relationship(type="HAS",direction=Relationship.UNDIRECTED)
	public Set<Atom> atoms;

	public Molecule(String name, Set<Atom> atoms) {
		this.name = name;
		this.atoms = atoms;
		this.atomCount = atoms.size();
	}

	public String getName() {
		return name;
	}

	public Set<Atom> getAtoms() {
		return atoms;
	}

	@Override
	public String toString() {
		return "Molecule{" +
				"id=" + id +
				", name='" + name + '\'' +
				", atomCount=" + atomCount +
				", atoms=" + atoms +
				'}';
	}
}

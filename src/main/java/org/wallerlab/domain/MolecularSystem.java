package org.wallerlab.domain;

import java.util.Set;
import org.neo4j.ogm.annotation.*;

/**
 * This domain model is adjusted the molecular system of a pdbml file. Is set as
 * a neo4j entity.
 * 
 * @author Christian Ouali Turki
 *
 */
@NodeEntity
public class MolecularSystem {

	@GraphId
	private Long id;

	private String name;
	public Integer numberOfMolecules;
	public Long numberOfAtoms;

	/*
	 * Set of molecules. @Relationship enables the relation between two domain models.
	 */
	@Relationship(type = "BELONGS_TO",direction=Relationship.UNDIRECTED)
	public Set<Molecule> molecules;

	public MolecularSystem(String nameOfSystem, Set<Molecule> molecules) {
		this.name = nameOfSystem;
		this.molecules = molecules;
		this.numberOfMolecules = molecules.size();
		this.numberOfAtoms = molecules.stream()
									  .flatMap(molecule ->
											  		molecule.getAtoms()
															.stream())
										.count();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public Integer getNumberOfMolecules() {
		return numberOfMolecules;
	}


	public Long  getNumberOfAtoms() {
		return numberOfAtoms;
	}


	public Set<Molecule> getMolecules() {
		return molecules;
	}


	@Override
	public String toString() {
		return "MolecularSystem [name=" + name + ", numberOfMolecules=" + numberOfMolecules
				+ ", numberOfAtoms=" + numberOfAtoms + ", molecules=" + molecules + "]";
	}


}

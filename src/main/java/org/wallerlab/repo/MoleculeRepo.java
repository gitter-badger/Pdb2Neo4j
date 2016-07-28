package org.wallerlab.repo;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.wallerlab.domain.Molecule;


interface MoleculeRepo extends Neo4jRepository<Molecule> {}

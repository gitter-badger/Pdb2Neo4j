package org.wallerlab.repo;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.wallerlab.domain.Molecule;

/**
 * Created by waller on 27/07/16.
 */
interface MoleculeRepo extends Neo4jRepository<Molecule> {}

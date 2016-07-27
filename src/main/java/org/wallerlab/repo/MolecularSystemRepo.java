package org.wallerlab.repo;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.wallerlab.domain.MolecularSystem;

public interface MolecularSystemRepo extends Neo4jRepository<MolecularSystem> {}

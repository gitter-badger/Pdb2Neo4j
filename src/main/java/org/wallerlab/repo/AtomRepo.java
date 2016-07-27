package org.wallerlab.repo;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.wallerlab.domain.Atom;

public interface AtomRepo extends Neo4jRepository<Atom> {}


package org.wallerlab;

import java.io.IOException;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.wallerlab.config.BatchConfig;
import org.wallerlab.domain.Atom;
import org.wallerlab.domain.MolecularSystem;
import org.wallerlab.domain.Molecule;

/**
 * Main class of the MasterNode. Uses spring boot to run the application.
 *
 * @author Christian Ouali Turki
 */
@SpringBootApplication
@Import(BatchConfig.class)
public class Pdb2Neo4j {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("unused")
		ApplicationContext context = SpringApplication.run(Pdb2Neo4j.class, args);
	}

    @Service public interface AtomRepository extends GraphRepository<Atom> {}

    @Service public interface MolecularSystemRepository extends GraphRepository<MolecularSystem> {}

    @Service public interface MoleculeRepository extends GraphRepository<Molecule>{}
}


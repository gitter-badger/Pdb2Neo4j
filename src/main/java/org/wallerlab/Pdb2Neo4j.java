package org.wallerlab;

import java.io.IOException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.wallerlab.config.BatchConfig;

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
		SpringApplication.run(Pdb2Neo4j.class, args);}

}


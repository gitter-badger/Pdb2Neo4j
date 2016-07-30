package org.wallerlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.wallerlab.config.BatchConfig;

import java.io.IOException;

/**
 * Main class of the MasterNode. Uses spring boot to run the application.
 *
 * @author Christian Ouali Turki
 */
@SpringBootApplication
@Import(BatchConfig.class)
public class Pdb2Neo4j {

    public static void main(String[] args) throws IOException {
		SpringApplication.run(Pdb2Neo4j.class);
	}

}


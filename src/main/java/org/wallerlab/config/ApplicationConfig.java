package org.wallerlab.config;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableExperimentalNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "org.wallerlab")
@EnableExperimentalNeo4jRepositories(basePackages = "org.wallerlab.repo")
@EnableTransactionManagement
public class ApplicationConfig {

	@Bean public SessionFactory sessionFactory() {
		return new SessionFactory("org.wallerlab.domain");
	}

	@Bean public Neo4jTransactionManager transactionManager() {
		return new Neo4jTransactionManager(sessionFactory());
	}

}

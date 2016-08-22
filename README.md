# Pdb2Neo4j

[![Join the chat at https://gitter.im/wallerlab/Pdb2Neo4j](https://badges.gitter.im/wallerlab/Pdb2Neo4j.svg)](https://gitter.im/wallerlab/Pdb2Neo4j?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Build Status](https://travis-ci.org/wallerlab/Pdb2Neo4j.svg?branch=master)](https://travis-ci.org/wallerlab/Pdb2Neo4j)
[![Coverage Status](https://coveralls.io/repos/github/wallerlab/Pdb2Neo4j/badge.svg?branch=master)](https://coveralls.io/github/wallerlab/Pdb2Neo4j?branch=master)

Bootstrap Graph DB with PDB xml files

Download and start a [`Neo4J server`](http://neo4j.com)

Open this url

http://localhost:7474/browser/

Set username: neo4j and password: wallerlab

Clone this repo:

`git clone https://github.com/wallerlab/Pdb2Neo4j.git`

`cd Pdb2Neo4j`

`./gradlew bootRun`

Edit the location  of your XML PDB files in the BatchConfig file.

by default:

`src/integTest/resources/*.xml`

will be bootstrapped into the DB running on your localhost.





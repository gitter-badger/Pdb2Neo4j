# Pdb2Neo4j
[![Build Status](https://travis-ci.org/wallerlab/Pdb2Neo4j.svg?branch=master)](https://travis-ci.org/wallerlab/Pdb2Neo4j)
[![Coverage Status](https://coveralls.io/repos/github/wallerlab/Pdb2Neo4j/badge.svg?branch=master)](https://coveralls.io/github/wallerlab/Pdb2Neo4j?branch=master)

Bootstrap Graph DB with PDB xml files

Download and start a [`Neo4J server`](http://neo4j.com)

Set password to be wallerlab

Clone this repo:

`git clone https://github.com/wallerlab/Pdb2Neo4j.git`

`cd Pdb2Neo4j`

`./gradlew bootRun`

XML PDB files placed under
`src/main/resources/pdb`
will be bootstrapped into the DB running on your localhost.





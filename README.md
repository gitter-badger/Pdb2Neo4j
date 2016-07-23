# Pdb2Neo4j
[![Build Status](https://travis-ci.org/wallerlab/reaktor.svg?branch=master)](https://travis-ci.org/wallerlab/reaktor)
[![Coverage Status](https://coveralls.io/repos/github/wallerlab/reaktor/badge.svg?branch=master)](https://coveralls.io/github/wallerlab/reaktor?branch=master)

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





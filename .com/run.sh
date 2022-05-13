#!/bin/bash
javadoc -docletpath target/.com-0.0.1-SNAPSHOT-jar-with-dependencies.jar -doclet Practice.com.Doclet "$@"

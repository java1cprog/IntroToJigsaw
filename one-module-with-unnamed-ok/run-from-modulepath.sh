#!/bin/bash
set -x #echo on
$JAVA9_BIN/java -modulepath modulepath  -addmods de.codecentric.zipvalidator -classpath classpath/de.codecentric.legacy.addresschecker/ de.codecentric.legacy.addresschecker.api.Run $1

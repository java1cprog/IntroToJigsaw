#!/bin/bash
set -x #echo on
$JAVA9_BIN/java -modulepath .:../jars -m de.codecentric.addresschecker/de.codecentric.addresschecker.api.Run $1

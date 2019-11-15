#!/usr/bin/env bash

JUNIT_HOME=./lib/junit-4.10.jar
CLASSES=./classes

test=Three
javac -d $CLASSES src/*$test*.java
javac -cp $JUNIT_HOME:$CLASSES -d $CLASSES test/*$test*.java

java -cp $JUNIT_HOME:$CLASSES TestRunner$test
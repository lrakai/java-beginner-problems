#!/usr/bin/env bash

JUNIT_HOME=./lib/junit-4.10.jar
CLASSES=./classes

javac -d $CLASSES src/*.java
javac -cp $JUNIT_HOME:$CLASSES -d $CLASSES test/*.java

java -cp $JUNIT_HOME:$CLASSES TestRunner 1
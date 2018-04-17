#!/bin/sh

cd resource-concourse-echo
mvn clean package -DskipTests
cp -a target/* ../artifacts/



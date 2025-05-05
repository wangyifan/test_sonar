# Makefile for Java SonarQube Integration Sample

.PHONY: build test coverage sonarqube clean

build:
	./gradlew build

test:
	./gradlew test

coverage:
	./gradlew jacocoTestReport
	open app/build/reports/jacoco/test/html/index.html

sonarqube:
	./gradlew sonarqube

clean:
	./gradlew clean
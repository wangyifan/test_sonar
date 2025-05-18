# System Patterns: Java SonarQube Integration Sample

## Architecture
- Single-module Gradle Java application
- Source code in `app/src/main/java`
- Tests in `app/src/test/java`
- Math operations encapsulated in `math.sample.MathOps`

## Key Technical Decisions
- Gradle for build and dependency management
- JUnit Jupiter for testing
- JaCoCo for test coverage
- SonarQube for code quality and coverage tracking

## Component Relationships
- `App` demonstrates usage of `MathOps`
- `MathOpsTest` covers addition operation (others to follow)
- Build pipeline runs tests, collects coverage, and reports to SonarQube
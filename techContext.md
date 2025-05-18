# Tech Context: Java SonarQube Integration Sample

## Technologies Used
- Java 21
- Gradle 8.x
- JUnit Jupiter 5.x
- JaCoCo
- SonarQube (plugin version 4.4.1.3373)

## Development Setup
- Java source: `app/src/main/java`
- Tests: `app/src/test/java`
- Build and test: `./gradlew build` or via IDE
- Coverage: `./gradlew jacocoTestReport`
- SonarQube analysis: `./gradlew sonarqube` (requires credentials)

## Technical Constraints
- Requires Java 21+
- SonarQube server and token must be provided

## Tool Usage Patterns
- Gradle plugins manage build, test, coverage, and analysis
- JaCoCo generates XML/HTML coverage reports
- SonarQube plugin uploads results for code quality tracking
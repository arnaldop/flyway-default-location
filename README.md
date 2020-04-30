This repository is for the Micronaut Flyway issue https://github.com/micronaut-projects/micronaut-flyway/issues/30.

### To run:

#### With enabled - Test passes:
`MICRONAUT_ENVIRONMENTS=with-enabled ./gradlew clean test`

#### Without location or enabled - Test fails:
`MICRONAUT_ENVIRONMENTS=without-location ./gradlew clean test`

#### With overridden location - Test passes:
`MICRONAUT_ENVIRONMENTS=with-location ./gradlew clean test`


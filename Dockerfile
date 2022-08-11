FROM maven:3.8.6-jdk-11
MAINTAINER carina_demo_tests <obukatich@solvd.com>
WORKDIR /CarinaPracticeTests
COPY ./src /CarinaPracticeTests/src
COPY pom.xml /CarinaPracticeTests
RUN mvn clean test-compile
CMD mvn clean test
EXPOSE 8080
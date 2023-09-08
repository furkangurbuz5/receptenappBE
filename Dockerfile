FROM maven:3.8.5-openjdk-17 as build
WORKDIR /usr/src/scaffolded
COPY . .
RUN mvn --batch-mode package
RUN cp target/*jar target/app.jar


FROM openjdk:21-ea-17-slim-buster
USER 1000
ENTRYPOINT ["java","-jar", "./app.jar"]
EXPOSE 8080
COPY --from=build /usr/src/scaffolded/target/app.jar app.jar
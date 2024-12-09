FROM maven:3.8.5-openjdk-17 as build
COPY . .
RUN mvn clean package -Dskiptests -X

From maven:3.8.4-openjdk-17-slim
COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]
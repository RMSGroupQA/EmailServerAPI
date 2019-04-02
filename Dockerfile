FROM maven as build
WORKDIR /build
COPY pom.xml .
COPY . .
RUN mvn clean install

FROM openjdk:8
COPY --from=build /build/target/SendEmail-0.0.1-SNAPSHOT.jar   send_email.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","send_email.jar"]




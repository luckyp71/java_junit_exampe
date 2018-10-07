#Installs the current application on a Java Image.
FROM java:8

#Create the directory where the application will reside
RUN mkdir /junit-example

#Build jar
FROM maven:3.5-jdk-8-alpine
WORKDIR /junit-example
ADD . /junit-example
RUN mvn clean package

#Specify working directory
WORKDIR /junit-example

#Run junit-example
CMD ["java", "-jar", "./target/junit-example-0.0.1-SNAPSHOT.jar"]
FROM java:8
EXPOSE 8080:8080
ADD /target/LevDockDnm.jar LevDockDnm.jar
ENTRYPOINT ["java","-jar","LevDockDnm.jar"]
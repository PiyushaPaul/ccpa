FROM adoptopenjdk/openjdk8:latest
ADD build/libs/creditcardpayementapp-1.0.1-SNAPSHOT.jar creditcardpayementapp-1.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","creditcardpayementapp-1.0.1-SNAPSHOT.jar" ]
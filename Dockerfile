FROM openjdk:11
WORKDIR /demojpa
COPY ./target/phandinhnhat_btth5-0.0.1-SNAPSHOT.jar /demojpa
COPY . /demojpa
EXPOSE 8080
CMD ["java","-jar","phandinhnhat_btth5-0.0.1-SNAPSHOT.jar"]
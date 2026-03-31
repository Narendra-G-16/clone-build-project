FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY . .

RUN javac App.java

CMD ["java", "App"]

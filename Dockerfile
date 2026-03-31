FROM openjdk:17

WORKDIR /app

COPY . .

RUN javac App.java

CMD ["java", "App"]

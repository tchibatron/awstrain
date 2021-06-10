FROM adoptopenjdk/openjdk11:jre-11.0.11_9-alpine
COPY awstrain-0.0.1-SNAPSHOT.jar /opt/awstrain/awstrain.jar
ENTRYPOINT exec java -jar /opt/awstrain/awstrain.jar
EXPOSE 8080

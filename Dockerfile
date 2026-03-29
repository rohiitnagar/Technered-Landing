FROM tomcat:10.1-jdk17

RUN rm -rf /usr/local/tomcat10-2/webapps/*

COPY target/*.war /usr/local/tomcat10-2/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]

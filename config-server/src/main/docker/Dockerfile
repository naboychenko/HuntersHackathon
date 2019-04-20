FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade && apk add netcat-openbsd && apk add curl && apk add unzip
RUN mkdir -p /usr/local/config-server
RUN echo $JAVA_HOME
RUN mkdir -p /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/security && \
    wget --no-check-certificate --header "Cookie: oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jce/8/jce_policy-8.zip" && \
    unzip -p jce_policy-8.zip UnlimitedJCEPolicyJDK8/local_policy.jar > /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/security/local_policy.jar && \
    unzip -p jce_policy-8.zip UnlimitedJCEPolicyJDK8/US_export_policy.jar > /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/security/US_export_policy.jar && \
    rm jce_policy-8.zip
ADD @project.build.finalName@.jar /usr/local/config-server/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
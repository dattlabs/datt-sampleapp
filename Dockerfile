FROM datt/datt-scala:latest
MAINTAINER John Albietz "inthecloud247@gmail.com"

ADD build.sbt /files/
ADD project /files/project
ADD src /files/src
#RUN sbt assembly

#CMD

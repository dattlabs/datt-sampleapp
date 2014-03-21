FROM datt/datt-openjdk7:latest
MAINTAINER inthecloud247 "inthecloud247@gmail.com"

# scala
RUN apt-get -y install scala

# sbt
RUN apt-get -y install sbt

# copy required conf files and folders
ADD project /files/project
ADD src /files/src
ADD build.sbt /files/build.sbt

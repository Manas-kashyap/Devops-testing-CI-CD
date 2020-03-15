FROM ubuntu
RUN \
  apt-get update && \
  apt-get upgrade -y && \
  echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list && \
  curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | sudo apt-key add && \
  apt-get update && \
  apt-get install -y sbt maven default-jdk scala 
WORKDIR /Json-parsing
ADD . /Json-parsing
CMD sbt run
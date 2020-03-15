name := "poc-ci-cd-pipeline"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"

// https://mvnrepository.com/artifact/com.typesafe.scala-logging/scala-logging
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test"

libraryDependencies += "org.apache.commons" % "commons-io" % "1.3.2"

libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.5.11"

libraryDependencies += "net.liftweb" %% "lift-json" % "3.4.0"

libraryDependencies += "org.twitter4j" % "twitter4j-stream" % "4.0.6"

libraryDependencies += "com.typesafe" % "config" % "1.4.0"

libraryDependencies += "org.mockito" %% "mockito-scala" % "1.11.4" % Test
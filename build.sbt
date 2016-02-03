name := "Scalatron"

version := "1.0"

scalaVersion := "2.11.4"

resolvers ++= Seq(
  "javanetDeps" at "http://download.java.net/maven/2/")

libraryDependencies ++= Seq(
  "com.sun.jersey" % "jersey-server" % "1.2",
  "com.sun.jersey" % "jersey-json" % "1.2",
  "org.eclipse.jetty" % "jetty-server" % "8.0.0.M0",
  "org.eclipse.jetty" % "jetty-servlet" % "8.0.0.M0"
)
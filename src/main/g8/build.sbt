name := "$name$"

version := "$applicationVersion$"

scalaVersion := "$scalaVersion$"

libraryDependencies ++= Seq(
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.eclipse.jetty" % "jetty-webapp" % "7.6.21.v20160908" % "container",
  "com.google.appengine" % "appengine-api-1.0-sdk" % "1.9.51",
  "com.google.appengine" % "appengine-api-stubs" % "1.9.51" % "test",
  "com.google.appengine" % "appengine-testing" % "1.9.51" % "test",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

appengineSettings

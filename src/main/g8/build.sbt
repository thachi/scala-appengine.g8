name := "$name$"

version := "$applicationVersion$"

scalaVersion := "$scalaVersion$"

libraryDependencies ++= Seq(
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.15.v20190215" % "container",
  "com.google.appengine" % "appengine-api-1.0-sdk" % "$appengineVersion$",
  "com.google.appengine" % "appengine-api-stubs" % "$appengineVersion$" % "test",
  "com.google.appengine" % "appengine-testing" % "$appengineVersion$" % "test",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

enablePlugins(AppenginePlugin)

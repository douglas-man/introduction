name := "introduction"

version := "1.0"

scalaVersion := "2.12.2"

resolvers ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies += "org.specs2" %% "specs2-core" % "3.8.9" % "test"
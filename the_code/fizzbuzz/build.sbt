organization := "poly.glot"

name := "fizzbuzz"

version := "0.0.0"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "junit"          % "junit"      % "4.9"   withSources(),
  "org.scalatest" %% "scalatest"  % "1.6.1" withSources(),
  "org.specs2"    %% "specs2"     % "1.5"   withSources()
)

scalacOptions in Test ++= Seq("-Yrangepos")

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

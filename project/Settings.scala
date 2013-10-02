import sbt._
import sbt.Keys._
import play.Project._

/**
 * Settings for your project.
 */
object Settings {

  import Dependencies._

  lazy val baseDeps = tests ++ time ++ webJars :+ jdbc

  val appName = "play-multimodule"

  val organizationName = "com.organization"

  val appVersion = "0.1-SNAPSHOT"

  // Build definition
  lazy val buildSettings = playScalaSettings ++ Seq(
    organization := organizationName,
    version := appVersion,
    scalaVersion := "2.10.2",
    crossPaths := false,
    scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
  )

  // resolvers, dependencies and other settings
  lazy val defaultSettings = buildSettings ++ Seq(
    resolvers ++= Resolvers.typesafe ++ Resolvers.sonatype ++ Resolvers.thirdParty,
    libraryDependencies ++= baseDeps,
    // remove default specs2 from Play
    testOptions in Test := Nil
  )
}
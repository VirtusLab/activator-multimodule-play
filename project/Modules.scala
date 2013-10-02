import play.Project._
import sbt.Keys._
import sbt._

/**
 * Modules definition.
 */
object Modules extends Build {

  import Settings._

  /** Common files for project */
  lazy val commons = play.Project(
    name = appName + "-commons",
    applicationVersion = appVersion,
    path = file("modules") / "commons",
    settings = defaultSettings
  )

  // Add your modules here
//  lazy val yourModule = play.Project(
//    name = appName + "-yourModule",
//    applicationVersion = appVersion,
//    path = file("modules") / "yourModule",
//    settings = defaultSettings
//  ).aggregate(
//    commons
//  ).dependsOn(
//    commons
//  )

  /** 'Top level' project, contains all other */
  lazy val main = play.Project(
    name = appName,
    applicationVersion = appVersion,
    path = file("."),
    settings = defaultSettings
  ).aggregate(
    commons // yourModule // Add your modules here
  ).dependsOn(
    commons // yourModule // Add your modules here
  )
}
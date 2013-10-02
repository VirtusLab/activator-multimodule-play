import sbt._

/**
 * Put your dependencies here and keep them in one place.
 *
 * Example dependencies added to illustrate the idea.
 */
object Dependencies {

  // Time
  val time = Seq(
    "joda-time" % "joda-time" % "2.3",
    "org.joda" % "joda-convert" % "1.4"
  )

  // Tests
  val tests = Seq(
    "org.scalatest" %% "scalatest" % "1.9.2" % "test",
    "junit" % "junit" % "4.11" % "test"
  )

  // Database
  val h2DbDriver = "com.h2database" % "h2" % "1.3.166"

  val webJars = Seq(
    "org.webjars" %% "webjars-play" % "2.2.0",
    "org.webjars" % "bootstrap" % "2.3.1"
  )
}
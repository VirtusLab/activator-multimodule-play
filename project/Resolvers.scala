import sbt._

/**
 * Put your resolvers here.
 *
 * Example resolvers already added.
 */
object Resolvers {
  val typesafe = Seq(
    Classpaths.typesafeReleases,
    Classpaths.typesafeSnapshots,
    "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
    "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"
  )

  val sonatype = Seq(
    "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
    "Sonatype releases" at "http://oss.sonatype.org/content/repositories/releases/"
  )

  val thirdParty = Seq(
    "julienrf.github.com" at "http://julienrf.github.com/repo/"
  )
}
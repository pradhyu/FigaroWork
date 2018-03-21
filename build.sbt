import sbt._
import Keys._

  lazy val figaroWorkSettings =  Seq(
    scalaVersion := "2.12.2",
    retrieveManaged := true
  )
  val figaroWorkVersion = "5.0.0.0"
  lazy val figaroWork = Project("FigaroWork", file("."))
    .settings(figaroWorkSettings)
    .settings (scalacOptions ++= Seq(
  "-feature",
  "-language:existentials",
  "-deprecation",
  "-language:postfixOps"
    ))
    .settings(libraryDependencies ++= Seq(
      "com.cra.figaro" %% "figaro" % s"${figaroWorkVersion}"
    ))

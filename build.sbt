name := "extprot-scala"

version := "0.1"

scalaVersion := "2.11.4"

description := "Extensible Protocols for Scala"

licenses += ("BSD Simplified", url("https://github.com/ermine-language/ermine-legacy/blob/master/LICENSE"))

seq(bintraySettings:_*)

bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("lastik")

publishMavenStyle := true

scalacOptions ++=
  Seq("-encoding", "UTF-8", "-Yrecursion", "50", "-deprecation",
      "-unchecked", "-Xlint", "-feature",
      "-language:implicitConversions", "-language:higherKinds",
      "-language:existentials")

javacOptions ++=
  Seq("-Xlint:cast", "-Xlint:deprecation", "-Xlint:empty",
      "-Xlint:finally", "-Xlint:fallthrough", "-Xlint:overrides")

parallelExecution := true

javacOptions += "-Xlint"

scalacOptions ~= (so => (so filterNot Set("-unchecked", "-Xlint"))
                    ++ Seq("-Ywarn-nullary-override", "-Ywarn-inaccessible"))

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.+"


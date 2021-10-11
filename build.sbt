name := "scala-test"

version := "0.1"
//version := "3.2.9"

resolvers += Resolver.sonatypeRepo("releases")
scalaVersion := "2.12.14"
//scalaVersion := "2.13.6"
val sparkVersion = "2.12"

ThisBuild / shellPrompt := { state => Project.extract(state).currentRef.project + "> " }

// define ModuleID for library dependencies
lazy val scalacheck = "org.scalacheck" %% "scalacheck" % "1.15.4"

libraryDependencies ++= Seq(
  "org.apache.logging.log4j" % "log4j-jul" % "2.14.1",
  "org.apache.derby" % "derby" % "10.15.2.0",
  "net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.24",
  "org.apache.spark" % "spark-streaming_2.10" % "2.0.0",
  "org.typelevel" %% "cats-core" % "2.6.1",
  "org.typelevel" %% "cats-effect-kernel" % "3.2.2",
  "org.typelevel" %% "cats-effect-std"    % "3.2.2",
  "org.typelevel" %% "cats-effect"        % "3.2.2",
)

//addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.10.0")
//addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.0-M4")

// available for 2.12, 2.13, 3.0
libraryDependencies += "co.fs2" %% "fs2-core" % "3.1.0"
libraryDependencies += "co.fs2" %% "fs2-io" % "3.1.0"
libraryDependencies += "co.fs2" %% "fs2-reactive-streams" % "3.1.0"

//libraryDependencies += "org.typelevel" %% "cats-core" % "2.3.0"
//libraryDependencies += "org.typelevel" %% "cats-effect" % "3.2.5"


// add a test dependency on ScalaCheck
libraryDependencies += scalacheck % Test

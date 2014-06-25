organization := "DjangoStars"

name := "Some alg project"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
    "junit" % "junit" % "4.8.1" % "test",
    "com.novocode" % "junit-interface" % "0.10" % "test"
)

autoScalaLibrary := false

name := "webstreaming"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.4.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.4.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kafka
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka" % "1.6.1"

//libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-8" % "2.4.0"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.46"

// https://mvnrepository.com/artifact/org.apache.hbase/hbase-client
libraryDependencies += "org.apache.hbase" % "hbase-client" % "2.0.0"


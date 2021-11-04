package com.vijay.spark

import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {

    val spark: SparkSession = SparkSession.builder().master("local[*]").appName("Hello World").getOrCreate()

    println("Welcome to Spark in Scala Application")

    spark.stop()
  }
}

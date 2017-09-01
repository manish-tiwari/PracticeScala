package com.manish.practice.sbtDependencies

import com.typesafe.scalalogging.slf4j.LazyLogging


/**
  * Created by Manish on 8/31/2017.
  */
object HelloWordlWithScalaLogging extends App with LazyLogging{
  logger.warn("Hello from Scala logging")
}

package com.manish.practice.helloworld

/**
  * Created by Manish on 8/31/2017.
  */
object HelloWorld extends App {
  //main method is not required here as it is being inherited from App trait
  println("Hello World from Scala.")
   /** *******************************
    * Lazy initialization            *
    * ********************************/
  lazy val lazilyInitializedVariable = "This will be initialized only when it is getting used somewhere"
  //immutableVariable=10 NOT Allowed!!!
   /** *******************************
    * Immutable Variables            *
    * ********************************/
  val immutableVariable: Int = 10
  mutableVariable = 7
   /** *******************************
    * Mutable Variables              *
    * ********************************/
  var mutableVariable: Int = 5
}

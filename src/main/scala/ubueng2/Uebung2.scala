package ubueng2

import scala.annotation.tailrec

class Uebung2 (val x:Boolean,val y:Boolean) {

  //Aufgabe 1
def or (x: Boolean, y: Boolean): Boolean = {
if (x) true else y

}


//Aufgabe 2
def myMethod(param:Int):String={
  param.toString

 if (param<0) "kleiner null + "+String.valueOf(param)
 else if (param>0) "groesser null "+String.valueOf(param)
else "null"
}

//Aufgabe 3
/**
val x={
  val offset= 1;
  {
    val x=2
    val offset=10
    x+offset
  } +
    {
      val x=5
      x+offset
    }
}
**/

  //Aufgabe 4
  def squareUnder(x:Double, max:Double):Double={
    var result =x
    while (result*result<max){
      result=x*x
    }
    x
  }

  //Aufgabe 5

  def teiler (zahl:Int):Int={
    var result=1
    for (i <- 2 until zahl){
      if (zahl%i==0) result=i
    }
    result
  }
  teiler(10)
  //Aufgabe 6
  /*fibbonaci-folge mit rekursion
  * */
  def fib(n:Int):Int={
    if (n==0) 0
    else if (n==1) 1
    else fib(n-1)+fib(n-2)
  }
}
import scala.annotation.tailrec

def convert(change:(String,Double)):(String,Double)={
  if (change._1=="Celsius") {
    val celsius = (change._2 - 32) * 5 / 9
    (change._1, celsius)
  }
  else {
    val fahrenheit = (change._2 * 9 / 5) + 32
    (change._1, fahrenheit)
  }
}
convert(("Celsius", 100))
//Aufgabe 3
//TODO:fix bug
def printHello(n:Int):Unit={
  def loop(i:Int):Unit= i match {
    case n if i==n => println("Hello")
    case _ => println("Hello"); loop(i+1)

  }
  loop(0)
}

//Aufgabe 4
def quersumme(x:Int):Int={
  if(x==0)0
  else x%10+quersumme(x/10)
}

//Aufgabe 6 Monte Carlo Algorithmus für Pi Berechnung mit rekursion und tail recursion

import scala.util.Random

def calculatePi(n:Int):Double={
  val x= new Random
  val y= new Random
  def loop(n:Int, count:Int):Double= n match {
    case 0 => count.toDouble/n.toDouble
    case _ => if (x.nextDouble()*x.nextDouble()+y.nextDouble()*y.nextDouble()<=1) loop(n-1, count+1) else loop(n-1, count)

  }
  loop(n,0)
}
calculatePi(1000000)

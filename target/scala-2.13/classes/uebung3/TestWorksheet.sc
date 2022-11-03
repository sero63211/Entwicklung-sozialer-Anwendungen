import scala.annotation.tailrec

class Uebung3  {
  //Aufgabe 1 und 2
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
  def quersumme(x:Int):Int=x match{
    case 0 => x
    case _ => quersumme(x/10)

  }
  //Aufgabe 5
  /*
def searchNumber(maxDiv:Int):Int=searchNumber2(maxDiv,1)
def searchNumber2(maxDiv:Int):Int=
  if(checkDiv(maxDiv,z))z else searchNumber2(maxDiv,z+1)
def checkDiv(i: Int, value: Any)

object Uebung3{
  def convert (convertTo:String,temperatur:Int):(String,Int)={
    if (convertTo=="Celsius") {
      val celsius = (temperatur - 32) * 5 / 9
      (convertTo, celsius)
    }
    else {
      val fahrenheit = (temperatur * 9 / 5) + 32
      (convertTo, fahrenheit)
    }
  }}*/
}

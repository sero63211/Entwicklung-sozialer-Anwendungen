import scala.annotation.tailrec
import scala.util.Random

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
def printHello(n:Int):Unit={
  @tailrec
  def loop(i:Int):Unit= i match {
    case n if n==i => println("")
    case _ => println("Hello"); loop(i+1)

  }
  loop(0)
}
printHello(5)
//Aufgabe 4
def quersumme(x:Int):Int={
  if(x==0)0
  else x%10+quersumme(x/10)
}

quersumme(1234)


//Aufgabe 5
def smallestMultiple(x:Int):Int={
  @tailrec
  def loop(i:Int):Int={
    if(i%x==0 && (1 to x).forall(i%_==0)) i
    else loop(i+1)
  }
  loop(1)
}
smallestMultiple(20)




//Aufgabe 6
def calculatePi(n:Int):Double={
  @tailrec
  def loop(i:Int,counter:Int):Double={
    if(i==n) counter.toDouble/n.toDouble*4
    else{
      val x= new Random
      val y= new Random
      if(x.nextDouble()*x.nextDouble()+y.nextDouble()*y.nextDouble()<=1)
        loop(i+1,counter+1)
      else
        loop(i+1,counter)
    }
  }
  loop(0,0)
}
calculatePi(100)


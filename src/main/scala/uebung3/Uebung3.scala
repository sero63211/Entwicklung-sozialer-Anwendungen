package uebung3

class ListUebung {
  def convert (convertTo:String,temperatur:Int):(String,Int)={
    if (convertTo=="Celsius") {
      val celsius = (temperatur - 32) * 5 / 9
      (convertTo, celsius)
    }
    else {
      val fahrenheit = (temperatur * 9 / 5) + 32
      (convertTo, fahrenheit)
    }
  }

}

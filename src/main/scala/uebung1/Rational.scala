package uebung1

class Rational (val numerator:Int, val denominator:Int){

  def this (denom:Int) = this(1,denom)
  override def toString:String = s"$num/$denom"

  require (denominator!=0,"Denominator muss != 0 sein")

  private val g = {
    val res= math.abs(gcd(numerator, denominator))
    if (numerator>0 && denominator<0 || numerator<0 && denominator<0) (-1)*res
    else res}

  def num:Int=numerator/g
  def denom:Int= denominator/g
  def value:Double = (num.toDouble / denom)

  def add(other:Rational):Rational= new Rational(num * other.denom + denom * other.num, denom * other.denom)

  def neg:Rational= new Rational((-1)*numerator,denominator)

  def sub(other:Rational):Rational= add(other.neg)

  def mul(other:Rational):Rational = new Rational(num*other.num, denom * other.denom)

  def  max(x:Rational): Rational = {

    if (numerator/denominator<x.num/x.denom) this else x
  }

  def gcd(a:Int,b:Int):Int= {	// greatest common divisor
    if (b==0) a
    else gcd(b, a % b)}

  def +(other:Rational):Rational= {
    new Rational(num * other.denom + denom * other.num, denom * other.denom)
  }


object Rational{

  def gcd(a:Int,b:Int):Int= {	// greatest common divisor
    if (b==0) a
    else gcd(b, a % b)
  }




}}
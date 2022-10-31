package test
import org.scalatest.funsuite.AnyFunSuite
import uebung1.Rational

class RationalTest extends AnyFunSuite {

  test("Rational Inititalisation 1") {
    val x = new Rational(1,2)
    assert(x.value === 0.5)
  }

  test("Rational Inititalisation 2") {
    val x = new Rational(1,2)
    assertResult("1/2"){x.toString}
  }

  test("Test requirement (denominator!=0)"){
    intercept [IllegalArgumentException] {
      new Rational(1,0)}
  }

  test("Test Negation from positive"){
    val x= new Rational(1,2)
    assertResult(-0.5){x.neg.value}
  }

  test("Test Negation from negative"){
    val x= new Rational(-1,2)
    assertResult(0.5){x.neg.value}
  }

  test("Test Add without Trim: 1/2 + 1/6 = 8/12"){
    val x = new Rational(1,2)
    val y = x.add(new Rational(1,6))
    assertResult("8/12") {s"${y.numerator}/${y.denominator}"}
  }

  test("Test Add result value: 1/2 + 1/6 = 0.6666666..."){
    val epsilon= 0.000001
    val x = new Rational(1,2)
    val y = x.add(new Rational(1,6))
    assert(math.abs(y.value-0.666666)<epsilon)
  }

  test("Test Add with Trim: 1/2 + 1/6 = 2/3") {
    val x = new Rational(1,2)
    val y = x.add(new Rational(1,6))
    assertResult("2/3") {y.toString}
  }

  test("Test Subtraction without Trim: 1/2 - 1/4 = 2/8"){
    val x = new Rational(1,2)
    val y = x.sub(new Rational(1,4))
    assertResult("2/8") {s"${y.numerator}/${y.denominator}"}
  }

  test("Test Subtraction result value: 1/2 - 1/4 = 0.25"){
    val x = new Rational(1,2)
    val y = x.sub(new Rational(1,4))
    assert(0.25===y.value)
  }

  test("Test Subtraction with Trim: 1/2 - 1/4 = 1/4"){
    val epsilon= 0.000001
    val x = new Rational(1,2)
    val y = x.sub(new Rational(1,4))
    assertResult("1/4"){y.toString}
  }
/**
  test("Test GCD"){
    val res = Rational.gcd(1060,855)
    assert(res===5)
  }

  test("Test GCD Negativ 1"){
    val res = Rational.gcd(-2,4)
    assert(res===(-2))
  }
  test("Test GCD Negativ"){
    val res = Rational.gcd(4,-2)
    assert(res===(-2))
  }
  test("Test GCD Negativ 3"){
    val res = Rational.gcd(-2,-4)
    assert(res===(-2))
  }
**/
  test("Trim (150/1250)"){
    val res = new Rational(150,1250)
    assertResult("3/25"){res.toString}
  }

  test("Trim (-1/-2)"){
    val res = new Rational(-1,-2)
    assertResult("1/2"){res.toString}
  }

  test("Trim (1/-2)"){
    val res = new Rational(1,-2)
    assertResult("-1/2"){res.toString}
  }
  test("Trim (-1/4)"){
    val res = new Rational(-1,4)
    assertResult("-1/4"){res.toString}
  }
  test("Multiplication and Add r1+ r2  mul r3") {
    val r1 = new Rational(1)
    val r2 = new Rational(2)
    val r3 = new Rational(10)
    val res = r1 + (r2 mul r3)
    assertResult("21/20") {
      res.toString
    }
  }
}

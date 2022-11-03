package test
import org.scalatest.funsuite.AnyFunSuite
import uebung3.Uebung3
class TestUebung3 extends AnyFunSuite {
 /* test("Test convert to Celsius") {
    val x = new Uebung3
    assertResult(("Celsius", 0)) {x.convert("Celsius", 32)}
  }

  test("Test convert to Celsius - different value") {
    val x = new Uebung3
    assertResult(("Celsius", -12.222222222222221)) {x.convert("Celsius", 10)}
  }

*/
  test("Quersumme 1234") {
    val x = new Uebung3
    assertResult(10) {x.quersumme(1234)}
  }
}

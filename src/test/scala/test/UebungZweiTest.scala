package test

import org.scalatest.funsuite.AnyFunSuite
import ubueng2.Uebung2


class UebungZweiTest extends AnyFunSuite{

  test("Return true"){
    val x=true
    val y=false
    val r=new Uebung2(x,y)
    assertResult(true){r.or(x,y)}
  }

  test("Return false"){
    val x=false
    val y=true
    val r=new Uebung2(x,y)
    assertResult(false){r.or(x,y)}
  }

  test("Return true if both are true"){
    val x=true
    val y=true
    val r=new Uebung2(x,y)
    assertResult(true){r.or(x,y)}
  }

  test("Return false if both are false"){
    val x=false
    val y=false
    val r=new Uebung2(x,y)
    assertResult(false){r.or(x,y)}
  }
/**
  test("Return true, but y is not type boolean"){
    val x=true
    val y=
    val r=new Uebung2(x,y)
    assertResult(true){r.or(x,y)}
  }**/

}

package ubueng2

class Uebung2 (val x:Boolean,val y:Boolean) {

  require(y || !y, "y muss ein bool'schen wert haben.")


  def or(x: Boolean, y: Boolean): Boolean = {
    if (x) true else false
  }


  object Uebung2 {
    def or(x: Boolean, y: Boolean): Boolean = {
      if (x) true else false
    }}
}
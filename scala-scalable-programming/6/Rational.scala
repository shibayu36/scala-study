class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  override def toString = {
    n + "/" + d
  }

  def + (that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  }

  def * (that: Rational): Rational = {
    new Rational(numer * that.numer, denom * that.denom)
  }

  def lessThan(that: Rational) = {
    this.numer * that.denom < that.numer * this.denom
  }

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}

implicit def intToRational(x: Int) = new Rational(x)

val oneHalf = new Rational(1, 2)
val twoThirds = new Rational(2,3)
println(oneHalf + twoThirds)
println(oneHalf lessThan twoThirds)

val three = new Rational(3)
println(three)

println(2 * oneHalf)

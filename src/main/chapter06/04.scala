/**
 * Created by Prescott on 10/11/14.
 */
class Point(val x: Int, val y: Int) {
  override def toString = s"($x, $y)"
}

object Point {
  def apply(x: Int, y: Int) = new Point(x, y)
}

val p1 = new Point(1, 5)
val p2 = Point(5, 10)
println(p1)
println(p2)

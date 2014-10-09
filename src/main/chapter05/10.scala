/**
 * Created by Prescott on 10/9/14.
 */

// define fields in primary constructor
class ShortEmployee(val name: String = "John Q. Public", var salary: Double = 0)

// defaults defined through auxiliary constructor
class Employe(val name: String, var salary: Double) {
  def this() { this("John Q. Public", 0) }
}

// no-argument primary constructor (inferior)
class LongEmployee {
  private var _name = "John Q. Public"
  var salary = 0.0
  def this(n: String, s: Double) { this(); _name = n; salary = s; }
  def name = _name

  override def toString = s"LongEmployee($name, $salary)"
}

val le1 = new LongEmployee()
val le2 = new LongEmployee("Prescott Murphy", 250000)
println(le1)
println(le2)


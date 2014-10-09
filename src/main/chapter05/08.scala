/**
 * Created by Prescott on 10/9/14.
 */
class Car(val make: String, val model: String, val year: Int, var license: String) {
  def this(make: String, model: String) {
    this(make, model, -1, "")
  }
  def this(make: String, model: String, year: Int) {
    this(make, model, year, "")
  }
  def this(make: String, model: String, license: String) {
    this(make, model, -1, "")
  }
  override def toString = s"Car($make, $model, $year, $license)"
}

val c1 = new Car("Audi", "S3", 2014, "PV NRT")
val c2 = new Car("VW", "Beetle", "SLGABUG")
val c3 = new Car("Honda", "Civic", 2001)
val c4 = new Car("Kia", "Sentra")

println(c1)
println(c2)
println(c3)
println(c4)


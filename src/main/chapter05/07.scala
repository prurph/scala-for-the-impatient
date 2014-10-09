/**
 * Created by Prescott on 10/9/14.
 */
class Person(name: String) {
  val Array(first, last) = name.split(" ")
//  name becomes object-private (equivalent to private[this] val name)
  override def toString = s"Person($name)"
}

val p = new Person("Prescott Murphy")
println(p.first)
println(p.last)
println(p)

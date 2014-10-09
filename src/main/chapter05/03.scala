/**
 * Created by Prescott on 10/9/14.
 */
class Time(val hours: Int, val minutes: Int) {
  def toMins: Int = hours * 60 + minutes
  def before(other: Time): Boolean = toMins < other.toMins
}

val t1 = new Time(12, 0)
val t2 = new Time(15, 0)
val t3 = new Time(12, 30)
val t4 = new Time(10, 0)

println(t1 before t2)
println(t1 before t3)
println(t1 before t4)
println(t1 before t1)

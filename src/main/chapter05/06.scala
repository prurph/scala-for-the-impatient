/**
 * Created by Prescott on 10/9/14.
 */
class Person(var age: Int) {
  if (age < 0) age = 0
}

val p1 = new Person(30)
val p2 = new Person(-50)

println(p1.age)
println(p2.age)


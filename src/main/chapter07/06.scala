/**
 * Created by Prescott on 10/12/14.
 */
import java.util.{HashMap => JavaHashMap }
import collection.mutable.{HashMap => ScalaHashMap}

def javaToScala[A,B](j: JavaHashMap[A,B]) = {
  import collection.JavaConversions.mapAsScalaMap
  
  val s = ScalaHashMap[A,B]()
  for ((k,v) <- j) s.put(k,v)
  s
}

val j = new JavaHashMap[String, Int]()

j.put("watermelon", 10)
j.put("mango", 5)
j.put("papaya", 1)

println(j)
println(javaToScala(j))

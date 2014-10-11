/**
 * Created by Prescott on 10/11/14.
 */

// compile this first as scalac 05.scala
// then run as scala Reverse Hello World
object Reverse extends App {
  val revArgs = args.reverse.mkString(" ")
  println(revArgs)
}

/**
 * Created by Prescott on 10/12/14.
 */
package object random {
  var seed = 0

  def setSeed(newSeed: Int) = { seed = newSeed }
//  () reflects there are side-effects
  def nextInt(): Int = {
    seed = (seed * 1664525 + 1013904223) % (2 ^ 32)
    seed
  }
  def nextDouble(): Double = nextInt().toDouble / (2 ^ 32)
}

import random._

object Q3 extends App {
  setSeed((System.currentTimeMillis() / 1000).toInt)
  println(seed)
  for (i <- 1 until 10) { println(nextInt()) }
  for (i <- 1 until 10) { println(nextDouble()) }
}

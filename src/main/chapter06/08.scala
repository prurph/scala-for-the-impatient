/**
 * Created by Prescott on 10/11/14.
 */
object ColorCube extends Enumeration {
  val Black   = Value(0x000000)
  val Red     = Value(0xff0000)
  val Yellow  = Value(0xffff00)
  val Green   = Value(0x00ff00)
  val Cyan    = Value(0x00ffff)
  val Blue    = Value(0x0000ff)
  val Magenta = Value(0xff00ff)
  val White   = Value(0xffffff)
}

for (c <- ColorCube.values) println("0x%06x: %s".format(c.id, c))

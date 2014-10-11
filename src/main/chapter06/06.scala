/**
 * Created by Prescott on 10/11/14.
 */
object Suit extends Enumeration {
  val Clubs    = Value("♣")
  val Hearts   = Value("♥")
  val Spades   = Value("♠")
  val Diamonds = Value("♦")
}

for (suit <- Suit.values) println(s"${suit.id}: $suit")
/**
 * Created by Prescott on 10/11/14.
 */
object Suit extends Enumeration {
  val Club    = Value("♣")
  val Heart   = Value("♥")
  val Spade   = Value("♠")
  val Diamond = Value("♦")

  def isRed(suit: Suit.Value) = suit == Heart || suit == Diamond
}

for (suit <- Suit.values) println(suit, Suit.isRed(suit))

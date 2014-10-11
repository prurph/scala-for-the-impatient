/**
 * Created by Prescott on 10/11/14.
 */
class UnitConversion(val factor: Double) {
  def convert(amount: Double): Double = amount * factor
}

object InchesToCentimeters extends UnitConversion(2.54)
object GallonsToLiters extends UnitConversion(3.78541)
object MilesToKilometers extends UnitConversion(1.60934)

val inches = 70.0
val gallons = 1.0
val miles = 500.0

println(InchesToCentimeters.convert(inches))
println(GallonsToLiters.convert(gallons))
println(MilesToKilometers.convert(miles))

/**
 * Created by Prescott on 10/11/14.
 */
object Conversions {
  def inchesToCentimeters(inches: Double): Double = inches * 2.54
  def gallonsToLiters(gallons: Double): Double = gallons * 3.78541
  def milesToKilometers(miles: Double): Double = miles * 1.60934
}

val inches = 70.0
val gallons = 1.0
val miles = 500.0

println(Conversions.inchesToCentimeters(inches))
println(Conversions.gallonsToLiters(gallons))
println(Conversions.milesToKilometers(miles))

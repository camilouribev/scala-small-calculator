package org.sofka
package refactoredcalculator

case class Invoice( products: List[Int]) extends CalculateIVA with CalculateIPOConsumption{
  val value: Double = products.sum
}

object Invoice {
  val IPOConsumption: Double = 0.16
  val IVA : Double = 0.19
}

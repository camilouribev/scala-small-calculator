package org.sofka
package refactoredcalculator

trait CalculateIVA {
  def calculateIVA(value : Double ): Double = {
    value * Invoice.IVA
  }
}

trait CalculateIPOConsumption {
  def calculateIPOConsumption(value : Double): Double = {
    value * Invoice.IPOConsumption
  }
}
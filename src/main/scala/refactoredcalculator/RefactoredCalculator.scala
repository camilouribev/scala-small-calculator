package org.sofka
package refactoredcalculator

object RefactoredCalculator extends App {
  private val newInvoice = Invoice(List(25,44,78,90))

  val brute: Double = newInvoice.value
  val totalIVA: Double = newInvoice.calculateIVA(brute)
  val totalIpoConsumption : Double = newInvoice.calculateIPOConsumption(brute)

  val total = brute + totalIVA + totalIpoConsumption

  println(s"Valor bruto: $brute")
  println(s"Valor iva : $totalIVA")
  println(s"Valor total: $total")

}

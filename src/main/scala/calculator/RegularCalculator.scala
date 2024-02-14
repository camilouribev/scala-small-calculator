package org.sofka
package calculator

object RegularCalculator extends App {
  val iva = 0.19
  val ipoConsumo = 0.16

  def calculateIVA(itemValue: Double): Double = {
    itemValue * iva
  }

  def calculateIpoConsumo(itemValue: Double): Double = {
    itemValue * ipoConsumo
  }

  def quotation(items: List[Double]): Unit = {
    val brute = items.sum
    val totalIVA = calculateIVA(brute)
    val totalIpoConsumo = calculateIpoConsumo(brute)
    val total = brute + totalIVA + totalIpoConsumo
    println(s"Valor bruto: $brute")
    println(s"Valor iva : $totalIVA")
    println(s"Valor total: $total")

  }


    quotation(List(20,40,677))



}

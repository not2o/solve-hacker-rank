package me.solve.hacker_rank.warmup.plus_minus

import scala.annotation.tailrec

object PlusMinus {
  private def check(n: Int, counter: (Int, Int, Int)): (Int, Int, Int) = n match {
    case 0 => (counter._1, counter._2, counter._3 + 1)
    case n if n > 0 => (counter._1 + 1, counter._2, counter._3)
    case _ => (counter._1, counter._2 + 1, counter._3)
  }

  @tailrec
  private def checkAll(list: List[Int], counter: (Int, Int, Int)): (Int, Int, Int) = list match {
    case Nil => counter
    case x :: xs => checkAll(xs, check(x, counter))
  }

  def plusMinus(arr: Array[Int]) {
    val input = arr.toList
    val result = checkAll(input, (0, 0, 0)) match {
      case (a, b, c) => (a.toDouble / input.size, b.toDouble / input.size, c.toDouble / input.size)
    }
    println(result._1)
    println(result._2)
    println(result._3)
  }
}

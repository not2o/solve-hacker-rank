package me.solve.hacker_rank.warmup.compare_triplets
import scala.collection.immutable.List

object CompareTriplets {
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
  
    def _compareTriplets(a: Array[Int], b: Array[Int], index: Int, result: Array[Int]): Array[Int] = {
      if (index >= a.length) {
        return result
      }
      
      val newResult = if (a(index) > b(index)) {
        Array(result(0) + 1, result(1))
      } else if (a(index) < b(index)) {
        Array(result(0), result(1) + 1)
      } else {
        result
      }
      
        _compareTriplets(a, b, index + 1, newResult)
    }
  _compareTriplets(a, b, 0, Array(0, 0))
  }
}

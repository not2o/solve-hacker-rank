package me.solve.hacker_rank.warmup.birth_day_cake_candles

object BirthDayCakeCandles {
  def birthdayCakeCandles(candles: Array[Long]): Int = {
    val max = candles.toList.max
    candles.toList.count(_ == max)
  }
}

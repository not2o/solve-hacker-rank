package me.solve.hacker_rank.warmup.stair_case

object StairCase {

  private def sharp(counter: Int, n: Int): String = {
    if (counter == n) {
      return "#" * n
    } else {
      return (" " * (n - counter)) + ("#" * counter)
    }
  }

  def staircase(n: Int): Unit = {
    for (i <- 1 to n) {
      println(sharp(i, n))
    }
  }
}

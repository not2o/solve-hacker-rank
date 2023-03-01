package me.solve.hacker_rank.solve_me_first

object SolveMeFirst {

  def solveMeFirst(source: List[String]): Int = source.take(2).map(_.toInt).sum

  def main(args: Array[String]) {
    println(solveMeFirst(io.Source.stdin.getLines().toList))
  }
}

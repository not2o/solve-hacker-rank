package me.solve.hacker_rank.solve_me_first

import me.solve.hacker_rank.warmup.solve_me_first.SolveMeFirst

class SolveMeFirstSpec extends munit.FunSuite {
  test("solve me first") {
    assertEquals(SolveMeFirst.solveMeFirst(List("1", "2")), 3)
  }
}

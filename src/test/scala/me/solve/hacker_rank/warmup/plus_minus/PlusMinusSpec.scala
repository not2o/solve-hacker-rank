package me.solve.hacker_rank.warmup.plus_minus

import me.solve.hacker_rank.warmup.plus_minus.PlusMinus

class PlusMinusSpec extends munit.FunSuite {
  test("plus minus") {
    PlusMinus.plusMinus(Array(1, 1, 0, -1, -1))
    PlusMinus.plusMinus(Array(-4, 3, -9, 0, 4, 1))
  }
}

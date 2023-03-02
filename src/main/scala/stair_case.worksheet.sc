val n = 6
println((" " * (n - 1) ) + ("#" * 1))
println((" " * (n - 2) ) + ("#" * 2))
println((" " * (n - 3) ) + ("#" * 3))
println((" " * (n - 4) ) + ("#" * 4))
println((" " * (n - 5) ) + ("#" * 5))
println(("#" * 6))

def sharp(counter: Int,n: Int): String = {
  if(counter == n) {
    return "#" * n
  }
  return (" " * (n - counter) ) + ("#" * counter)
}

def staircase(n: Int): Unit = {
    for (i <- 1 to n) {
      println(sharp(i, n))
    }
  }

staircase(6)
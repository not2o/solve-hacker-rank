import me.solve.hacker_rank.fp.ArrayOfNElments
import me.solve.hacker_rank.fp.ListReplication
val times = 5
val n: List[Int] = List(1,2,3,4,5)

n ++ n

ListReplication.f(times,n)

n.appended(2)

ArrayOfNElments.f(3)


def reverse(n: List[Int]): List[Int] = {
    def _reverse(n:List[Int], result: List[Int]): List[Int] = {
        if(n == Nil) result else _reverse(n.tail, n.head :: result)
    }
    _reverse(n, Nil)
}
n.reverse
reverse(n)
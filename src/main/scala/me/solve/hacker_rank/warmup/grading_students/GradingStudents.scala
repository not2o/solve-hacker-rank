package me.solve.hacker_rank.warmup.grading_students

object GradingStudents {
  def gradingStudents(grades: Array[Int]): Array[Int] = {
    return grades.map(roundGrade(_))
}

def roundGrade(n: Int): Int = {
    return if(n >= 38) {
        val next = (((n /5) + 1) * 5)
        if((next - n) >= 3) {
            n
        } else {
            next
        }
    } else {
        n
    }
}
}

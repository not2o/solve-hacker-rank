val n = 30

roundGrade(n)
roundGrade(38)
roundGrade(67)
roundGrade(73)
roundGrade(33)

gradingStudents(Array(30,38,67,73,33)).foreach(println(_))

def gradingStudents(grades: Array[Int]): Array[Int] = {
    // Write your code here
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
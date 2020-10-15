
/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    val roundedGrades  = mutableListOf<Int>()
        val  nextMultipleOfFive : (Int) -> Int = { grade:Int->
                   var g= grade
                   while(g%5!=0){
                       g+=1
                   }
                   g
           }
        for(grade:Int in grades){
            if(grade < 38) {
                roundedGrades.add(grade)
                continue
            }
            val multiple = nextMultipleOfFive(grade)
            val diff = multiple - grade
            val finalGrade:Int = if(diff<3) multiple else grade
            roundedGrades.add(finalGrade)
        }
    return roundedGrades.toTypedArray()
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}

import kotlin.math.max
import java.util.Scanner
import kotlin.math.min

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var scoreIncreased:Int= 0
    var scoreDescresed:Int= 0
    var cur_max=Integer.MIN_VALUE
    var cur_min=Integer.MAX_VALUE
    for (score in scores) {
        val new_max = max(cur_max,score)
        val new_min = min(cur_min,score)
        if(cur_max!=new_max) scoreIncreased+=1
        if(cur_min!=new_min) scoreDescresed+=1
        cur_max = new_max
        cur_min = new_min
    }
    //-1 because first change is skipped
    return arrayOf(scoreIncreased-1,scoreDescresed-1)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
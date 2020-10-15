import java.lang.Integer.max
import java.lang.Integer.min

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
   var betweenSet:Int=0
    a.sort()
    b.sort()
    val isFactor:(Int,Int)->Boolean = {n1,n2->
        val max = max(n1,n2)
        val min=  min(n1,n2)
        (max % min ==0)
    }
    val fullNums = a.toMutableList().apply { addAll(b) }
    val betweeners =   (a.last()..b.first())
    betweeners.forEach { bn->
        val hasAnyFactor = fullNums.all { isFactor(bn,it) }
        if(hasAnyFactor)
            betweenSet+=1
    }
    return betweenSet
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}

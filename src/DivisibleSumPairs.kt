import java.util.*

// Complete the divisibleSumPairs function below.
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
   var divisiblePairs=0
    for(i in ar.indices){
        for(j in (i+1)..(ar.lastIndex)){
            if((ar[i]+ar[j])%k==0) divisiblePairs+=1
        }
    }
    return divisiblePairs
}
//6 3
//1 3 2 6 1 2
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
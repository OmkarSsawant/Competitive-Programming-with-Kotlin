

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
   var waysDivideChoclatebar=0
    for(i in s.indices){
        if(i+(m-1) > s.size-1)
            break
        val pieceSum = s.sliceArray(i until i+m).sum()
        if(pieceSum==d) waysDivideChoclatebar+=1
    }
    return waysDivideChoclatebar
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}

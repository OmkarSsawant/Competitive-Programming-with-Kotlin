import java.util.*

/*
@HackerRank
 #kotlin Solution for
refer question from
 */
// Complete the countApplesAndOranges function below.
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int,
                          apples: Array<Int>, oranges: Array<Int>): Unit {
    val house:IntRange =  s..t
    var applesOnHouse:Int=0
    var orangesOnHouse:Int=0
    for(apple in apples){
        val distance = a + apple
        if(house.contains(distance)){
            applesOnHouse+=1
        }
    }
    for(orange in oranges){
        val distance = b + orange
        if(house.contains(distance)){
            orangesOnHouse+=1
        }
    }

    println(applesOnHouse)
    println(orangesOnHouse)
}
//input
/*
7 11
5 15
3 2
-2 2 1
5 -6
* */


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val st = scan.nextLine().split(" ")

    val s = st[0].trim().toInt()

    val t = st[1].trim().toInt()

    val ab = scan.nextLine().split(" ")

    val a = ab[0].trim().toInt()

    val b = ab[1].trim().toInt()

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val apples = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val oranges = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}

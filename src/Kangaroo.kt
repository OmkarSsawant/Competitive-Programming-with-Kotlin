    import java.util.Scanner



// Complete the kangaroo function below.
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
//    val k1backAndSlow:Boolean = (x1 < x2 && v1 < v2)
//    val k2backAndSlow:Boolean = (x2 < x1 && v2 < v1)
//    if(k1backAndSlow || k2backAndSlow ||arrayOf(v1,v2).any{it==0})return  "NO"
//
//    //start at same point with same speed
//    if(x1+v1 == x2+v2 || x2-x1 % v2-v1 == 0 ) return "YES"
//    //Here,The way we can identify that
//    //they can meet each-other at some point
//    //is check wheather they are multiple
//    //of either each-other
//    val isMultiple :(Int,Int) -> Boolean = {n1,n2-> n1%n2==0 }
//    val d1 = x1+v1
//    val d2 = x2+v2
//    val max= listOf(d1,d2).max()!!
//    val min = listOf(d1,d2).min()!!
//    val canMeet:Boolean =  (2..min).any{ isMultiple(max,it) && isMultiple(min,it) }
//    return if(canMeet) "YES" else "NO"

    return if (x1 == x2 && v1 == v2) {
         "YES"
    } else if (x1 == x2 && v1 > v2) {
         "NO"
    } else if (x1 <= x2 && v1 <= v2) {
         "NO"
    } else {
        if (x2.minus(x1) % v1.minus(v2)== 0) return "YES"
        else return "NO"
    }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x1V1X2V2 = scan.nextLine().split(" ")

    val x1 = x1V1X2V2[0].trim().toInt()

    val v1 = x1V1X2V2[1].trim().toInt()

    val x2 = x1V1X2V2[2].trim().toInt()

    val v2 = x1V1X2V2[3].trim().toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
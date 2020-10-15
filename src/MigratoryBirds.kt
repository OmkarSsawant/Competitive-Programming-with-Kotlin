
// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
//Solution 1:
//    arr.sort()
//    val maxCounts = arr.map { a-> arr.count { it==a } }
//    val maxCount = maxCounts.max()
//    for (i in arr.indices){
//        if(maxCounts[i] == maxCount) return arr[i]
//    }
//    return arr[0]
    //Solution 2:
//    val counts = arr.map { a -> arr.count { it==a } }
//    val maxCount = counts.max()
//    val birdWithFrequecies:List<Pair<Int,Int>> = arr.mapIndexed { i,a -> a to counts[i] }
//    val maxFrequencyBirds = birdWithFrequecies.filter { pair -> pair.second == maxCount }
//    return maxFrequencyBirds.map { pair -> pair.first }.first()
    val bird_freq = arrayOf(0, 0, 0, 0, 0, 0)
    for (i in arr.indices){
        bird_freq[arr[i]] += 1
    }
    return bird_freq.indexOf(bird_freq.max())
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}

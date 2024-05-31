fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    var str =""
    for (i in 1 .. b){
        for (j in 1..a){
            str += "*"
        }
        println("${str}")
        str =""
    }
}
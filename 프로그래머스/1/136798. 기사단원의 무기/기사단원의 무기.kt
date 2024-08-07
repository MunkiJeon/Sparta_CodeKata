import kotlin.math.sqrt
class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        var arr : MutableList<Int> = findDivisor(number)
        for ( i in 1..number){

            if( findDivisor(i).size >  limit){
                answer += power
            }else {
                answer += findDivisor(i).size
            }
        }
        return answer
    }
}
//약수 구하는 펑션
fun findDivisor(number: Int) : ArrayList<Int> {
    val sqrt = sqrt(number.toDouble())
    val result = arrayListOf<Int>()
    for (i in 1 .. sqrt.toInt()) {
        if (number % i == 0) {
            result.add(i)
            if (number / i != i) {
                result.add(number / i)
            }
        }
    }

    result.sorted()
    // println("${number}의 모든 약수 : ${result}")
    return result
}
import kotlin.math.*
class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for (i in left .. right){
            var result = arrayListOf<Int>()
            for (j in 1 .. sqrt(i.toDouble()).toInt()){
                if (i % j == 0) {
                    result.add(j)
                    if (i / j != j) { result.add(i / i) }
                }
            }
            if (result.size%2 == 0){ answer += i}
            else{answer -= i}
        }
        return answer
    }
}
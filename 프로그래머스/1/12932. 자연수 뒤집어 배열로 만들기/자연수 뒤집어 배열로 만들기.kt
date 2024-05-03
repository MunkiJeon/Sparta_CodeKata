class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        for (i in n.toString().substring(0) ) {
            answer = answer.plus(i.toString().toInt())
        }
        answer.reverse()
        return answer
    }
}
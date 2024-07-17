class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        score.sortedDescending().chunked(m).forEach{
            // println(it)
            // case1: [3, 3, 2, 2], [1, 1, 1]
            // case2: [4, 4, 4], [4, 4, 4], [2, 2, 2], [2, 1, 1]
            if(it.size == m){
                answer += it.minOrNull()!! * m
            }
        }
        return answer
    }
}
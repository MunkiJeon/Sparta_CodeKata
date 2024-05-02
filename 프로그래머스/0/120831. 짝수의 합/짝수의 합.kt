class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for (two in n downTo 0) {
            if (two % 2 == 0) answer += two
        }
        return answer
    }
}
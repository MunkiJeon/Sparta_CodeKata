class Solution {
    fun solution(num: Int, n: Int): Int {
        var answer: Int = if(num%n == 0) 1 else 0
        return answer
    }
}
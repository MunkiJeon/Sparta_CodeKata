class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        if ((a.toString() + b.toString()).toInt() >= (b.toString() + a.toString()).toInt()) {
            answer = (a.toString() + b.toString()).toInt()
        } else {
            answer = (b.toString() + a.toString()).toInt()
        }
        return answer
    }
}
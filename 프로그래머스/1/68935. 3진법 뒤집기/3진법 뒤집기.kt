class Solution {
    fun solution(n: Int): Int {
        //n을 3진법으로 표현후 뒤집고 다시 3진 정수로 변경
        return n.toString(3).reversed().toInt(3)
    }
}
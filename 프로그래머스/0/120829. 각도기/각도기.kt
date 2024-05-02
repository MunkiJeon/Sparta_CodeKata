class Solution {
    fun solution(angle: Int): Int {
        var answer: Int =
                if (0 < angle && angle < 90) 1
                else if (angle == 90) 2 else if (90 < angle && angle < 180) 3 else 4
        return answer
    }
}
/*
문제 설명
정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

제한사항
0 < n ≤ 1000
*/

class Solution009 {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for (two in n downTo 0) {
            if (two % 2 == 0) answer += two
        }
        return answer
    }
}

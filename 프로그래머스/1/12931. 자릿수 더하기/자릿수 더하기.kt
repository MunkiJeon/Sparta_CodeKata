class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for (i in n.toString().substring(0)) {
            answer += i.toString().toInt()
        }
        return answer
    }
}
/*
문제 설명
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

제한사항
N의 범위 : 100,000,000 이하의 자연수
*/

class Solution013 {
    fun solution(n: Int): Int {
        var answer = 0
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for (i in n.toString().substring(0)) {
            // println(i.toString().toInt())
            answer += i.toString().toInt()
        }
        return answer
    }
}

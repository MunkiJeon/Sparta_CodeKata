/*
문제 설명
정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.

제한사항
0 < num1 ≤ 100
0 < num2 ≤ 100
*/

class Solution007 {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = ((num1.toDouble() / num2.toDouble()) * 1000).toInt()
        return answer
    }
}

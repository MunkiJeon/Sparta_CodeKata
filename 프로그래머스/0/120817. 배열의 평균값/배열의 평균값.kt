class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        var sum : Double = 0.0
        for (i in numbers) {
            sum += i
        }
        answer = (sum / numbers.size)
        return answer
    }
}
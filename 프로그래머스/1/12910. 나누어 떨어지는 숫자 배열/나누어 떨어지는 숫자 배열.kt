class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        for (i in arr.sortedArray()) {
            if (i % divisor == 0 ) {
                answer = answer.plus(i)
            }
        }
        if (answer.size== 0) answer = answer.plus(-1)
        return answer
    }
}
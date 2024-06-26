class Solution {
    fun solution(numbers: IntArray): IntArray {
        // var answer: IntArray = intArrayOf()
        // return answer
        var answer: Set<Int> = setOf()
        for ((i_index, i) in numbers.withIndex()) {
            for ((j_index, j) in numbers.withIndex()){
                if (i_index == j_index)continue
                else answer += answer.plus(i+j)
            }
        }
        return answer.sorted().toIntArray()
    }
}
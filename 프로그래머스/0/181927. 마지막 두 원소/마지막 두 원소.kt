class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = num_list.clone()
        var lastidx = num_list.lastIndex
        if (num_list[lastidx] > num_list[lastidx - 1]) {
            answer = answer.plus(num_list[lastidx] - num_list[lastidx - 1])
        } else {
            answer = answer.plus(num_list[lastidx] * 2)
        }
        return answer
    }
}
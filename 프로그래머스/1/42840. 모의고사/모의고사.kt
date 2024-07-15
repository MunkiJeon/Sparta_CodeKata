class Solution {
    fun solution(answers: IntArray): IntArray {
         var intArrs = arrayListOf<IntArray>(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5),
            intArrayOf(0, 0, 0)
        )
        var answer = mutableListOf<Int>()
        var max = 0
        for ((index, i) in answers.withIndex()) {
            if (intArrs[0][index % intArrs[0].size] == i) {
                intArrs[3].set(0, intArrs[3].get(0) + 1)
            }
            if (intArrs[1][index % intArrs[1].size] == i) {
                intArrs[3].set(1, intArrs[3].get(1) + 1)
            }
            if (intArrs[2][index % intArrs[2].size] == i) {
                intArrs[3].set(2, intArrs[3].get(2) + 1)
            }
        }
        if (intArrs[3].get(0) == intArrs[3].get(1)&& intArrs[3].get(1) == intArrs[3].get(2)){max = intArrs[3].get(0)}
        else if (intArrs[3].get(0) >= intArrs[3].get(1)&&intArrs[3].get(0) >= intArrs[3].get(2)){max = intArrs[3].get(0)}
        else if (intArrs[3].get(1) >= intArrs[3].get(0)&&intArrs[3].get(1) >= intArrs[3].get(2)){max = intArrs[3].get(1)}
        else if (intArrs[3].get(2) >= intArrs[3].get(0)&&intArrs[3].get(2) >= intArrs[3].get(1)){max = intArrs[3].get(2)}
        answer.apply {
            for ((idx, score) in intArrs[3].withIndex()) {
//                if (score == Collections.max(intArrs[3].toMutableList())){
//                    answer.add(idx +1)
//                }
                if (score == max){
                    answer.add(idx +1)
                }
            }
        }
        return answer.toIntArray()
    }
}
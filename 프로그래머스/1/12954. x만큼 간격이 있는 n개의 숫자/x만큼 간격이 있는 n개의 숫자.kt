class Solution {
    fun solution(x: Int, n: Int): LongArray {
//         var answer = LongArray(n)//다른분 답안
//         answer[0] = x.toLong()
        
//         for (i in 1 until n) {
//             answer[i] = answer[i - 1] + x
//         }

        var answer = longArrayOf()
        for (i in 0..n - 1) {
            answer = answer.plus(x * (i + 1).toLong())
        }
        return answer
    }
}
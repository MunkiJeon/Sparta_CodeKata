class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr.clone()
        for( i  in queries ){
            var a = answer[i[0]]
            var b = answer[i[1]]
            answer.set(i[0], b)
            answer.set(i[1], a)
        }
        return answer
    }
}
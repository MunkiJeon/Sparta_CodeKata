class Solution {
    fun solution(n: Int): String {
        var answer = ""
        for (i in 0 until n){
            var str ="수박"
            answer += str[i%2]
        }
        return answer
    }
}
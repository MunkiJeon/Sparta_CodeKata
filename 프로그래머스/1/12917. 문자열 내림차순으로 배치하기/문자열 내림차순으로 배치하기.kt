class Solution {
    fun solution(s: String): String {
        var answer = ""
        for(i in s.toString().toCharArray().sorted().reversed()){ answer += i }
        return answer
    }
}
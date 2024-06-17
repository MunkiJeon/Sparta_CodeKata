class Solution {
    fun solution(s: String): String {
        var strCut = s.uppercase().split(" ")
        var answer = ""
        for ((index,i)in strCut.withIndex()){
            for ((index,j) in i.toCharArray().withIndex()){
                if (index%2 ==1) answer += j.lowercase()
                else answer += j
            }
            if (index != strCut.size-1)answer += " "
        }
        return answer
    }
}
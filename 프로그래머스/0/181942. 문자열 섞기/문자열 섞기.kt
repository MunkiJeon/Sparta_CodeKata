class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        for(i in 0 until str1.length){
            answer+= str1[i].toString() + str2[i].toString()
        }
        return answer
    }
}
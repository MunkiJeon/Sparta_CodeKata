class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        var x = 0
        for(i in seoul) {
            if (i == "Kim"){ answer = "김서방은 ${x}에 있다"; break;}
            ++x
        }
        return answer
    }
}
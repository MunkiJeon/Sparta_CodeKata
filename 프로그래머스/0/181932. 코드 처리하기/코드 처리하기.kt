class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode: Boolean = true
        for ((index, i) in code.withIndex()) {
            if(i == '1') mode = !mode
            if (mode && i.toString().toIntOrNull() == null && i != ' ') {
                if (index % 2 == 0) answer += i
            } else if (i.toString().toIntOrNull() == null && i != ' ') {
                if (index % 2 != 0) answer += i
            }
        }
        if(answer.isEmpty()){answer += "EMPTY"}
        return answer
    }
}
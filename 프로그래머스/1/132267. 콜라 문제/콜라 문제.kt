class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var extra = 0
        var coca = n
        while (coca >= a) {
            if (coca % a != 0) extra += coca % a
            coca = coca / a * b
            answer += coca
            coca += extra
            extra = 0
        }
        return answer
    }
}
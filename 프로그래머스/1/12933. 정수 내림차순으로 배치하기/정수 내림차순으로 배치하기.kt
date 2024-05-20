class Solution {
    fun solution(n: Long): Long {
        //받은 `long`숫자를 `Char`형태 배열로 바꿈
        //sortedArrayDescending() = 내림차순
        return String("$n".toCharArray().sortedArrayDescending()).toLong()
    }
}
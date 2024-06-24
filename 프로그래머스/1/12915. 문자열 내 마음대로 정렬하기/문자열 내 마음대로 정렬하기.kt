class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        return strings.also {
            //오름차순으로 정렬
            it.sort()
            //n번째 문자로 한번더 정렬
            it.sortBy { it[n] }
        }
    }
}
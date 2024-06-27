class Solution {
    fun solution(s: String): IntArray {
        //내 풀이방식.. 실패(예시는 풀었지만 제출문제에서 컷!)
        //
        // var answer: IntArray = intArrayOf()
        // for((index,i) in s.withIndex()){
        //     if (s.indexOf(i) == index) answer = answer.plus(-1)
        //     else answer = answer.plus(index - s.indexOf(i, index/2))
        // }
        // return answer
        val prevIndexMap = hashMapOf<Char, Int>()
        
        var answer = s.mapIndexed{ index, item ->
            val prevIndex = prevIndexMap[item]
            prevIndexMap[item] = index

            if (prevIndex == null) -1 else index - prevIndex
        }.toIntArray()
        
        return answer
    }
}
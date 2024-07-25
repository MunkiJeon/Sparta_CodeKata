class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        for( (index,i) in included.withIndex()){
            if(i){
                answer += a + (d*index)
            }
        }
        return answer
    }
}
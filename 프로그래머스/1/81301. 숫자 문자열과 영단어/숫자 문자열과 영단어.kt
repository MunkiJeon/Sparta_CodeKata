class Solution {
    fun solution(s: String): Int {
        var trStr = listOf("zero","one","two","three","four","five","six","seven","eight","nine")
        var answer = s
        for ((index,i) in trStr.withIndex()){ answer = answer.replace(i,index.toString()) }
        return answer.toInt()
    }
}
class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        for((index,i) in food.withIndex()){
            for (f in 1..i/2){
                answer = answer+index.toString()
            }
        }
        return answer+"0"+answer.reversed()
    }
}
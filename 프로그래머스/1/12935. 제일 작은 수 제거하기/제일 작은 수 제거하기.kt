class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        if(arr.size > 1){
          for (i in 0 until arr.size){
            if(arr[i] != arr.minOrNull()){
                answer = answer.plus(arr[i]) }
          }  
        } else { answer = answer.plus(-1)}
        return answer
    }
}
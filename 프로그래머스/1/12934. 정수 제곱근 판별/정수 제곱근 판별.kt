import kotlin.math.*

class Solution {
    fun solution(n: Long): Long {
        // var answer: Long = 0
        var x = sqrt(n.toDouble()).toLong()
        // for(i in n downTo 1){
        //    if(i*i == n){
        //        answer = (i+1)*(i+1)
        //        break
        //    }else{answer = -1}
        // }
        // return answer
        
        return if (x*x == n){
            (x+1)*(x+1)
        }else {
            -1
        }
    }
}
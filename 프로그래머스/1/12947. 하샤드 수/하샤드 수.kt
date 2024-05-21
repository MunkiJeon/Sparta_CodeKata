class Solution {
    fun solution(x: Int): Boolean {
        var i_Sum = 0
        for(i in x.toString().substring(0)){
            i_Sum += i.toString().toInt()
        }
        return if(x%i_Sum == 0) true else false
    }
}
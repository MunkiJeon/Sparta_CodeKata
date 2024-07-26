class Solution {
    fun solution(num_list: IntArray): Int {
        var a = 1
        var b = 0
        for (i in num_list){
            a *= i 
            b += i
        }
        b = b*b
        
        return if(a > b)0 else 1
    }
}
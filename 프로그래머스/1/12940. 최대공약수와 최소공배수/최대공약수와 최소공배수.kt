import kotlin.math.*
class Solution {
    fun solution(n: Int, m: Int): IntArray {
        return intArrayOf(gcm(n, m), lcm(n, m))
    }
    fun gcm(a: Int, b: Int): Int { //최대 공약수
        var maximum = max(a, b)
        var minimum = min(a, b)

        return if ( minimum != 0) { gcm(minimum, maximum % minimum) } 
        else { maximum }
    }
    //최소 공배수
    fun lcm(a: Int, b: Int): Int = (a * b) / gcm(a, b)
}
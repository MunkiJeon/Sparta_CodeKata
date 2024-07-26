class Solution {
    fun solution(num_list: IntArray): Int {
        var a = ""
        var b = ""
        for (i in num_list){
            if (i%2 != 0)a += i
            else b += i
        }

        return a.toInt() + b.toInt()
    }
}
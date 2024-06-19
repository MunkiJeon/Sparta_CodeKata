import kotlin.math.*
class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var w = 0
        var h = 0
        for (i in sizes){
            i.sort()
            // if (w < i.max()) w = i.max()
            // if (h < i.min()) h = i.min()
            if (w < Math.max(i[0],i[1])) w = Math.max(i[0],i[1])
            if (h < Math.min(i[0],i[1])) h = Math.min(i[0],i[1])
        }
        return w * h
    }
}
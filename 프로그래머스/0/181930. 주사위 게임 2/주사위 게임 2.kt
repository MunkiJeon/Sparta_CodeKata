class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer: Int = 1
        var loof = 0
        var a_ = 1
        var b_ = 1
        var c_ = 1
        if(a == b && b == c){ loof = 2 }
        else if(a == b &&  b != c //221
            || a == c && b != c //212
            || b==c && a!=b){ loof = 1 }//122
        for( i in 0..loof){
            a_ *= a
            b_ *= b
            c_ *= c
            answer *= a_ + b_ + c_
        }
        return answer
    }
}
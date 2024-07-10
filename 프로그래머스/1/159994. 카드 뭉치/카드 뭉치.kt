class Solution {
        fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String { //55
        var aint = 0
        var bint = 0
        for ((index, i) in goal.withIndex()) {
            if (cards1.size > aint && i == cards1[aint] ) {
                aint++
            } else if (cards2.size > bint && i == cards2[bint] ) {
         // } else if ( i == cards2[bint] && cards2.size > bint ) {
                // 값을 먼저 거내오려니 애러 뜸 - 조건식의 순서의 중요성...
                // ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
                bint++
            } else return "No"
        }
        return "Yes"
    }
}
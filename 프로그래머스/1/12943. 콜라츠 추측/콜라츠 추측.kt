class Solution {
    fun solution(num: Int): Int {
        var l_Num = 500
        var answer = if (num == 1) 0 else num
        if (num != 1){
            for (i in 0 .. l_Num){
                if (i == 500 || answer < 0) { answer = -1; break;}
                else if (answer%2 == 0) {answer /= 2}
                else if (answer == 1) {answer = i; break;}
                else {answer = (answer*3)+1}
            }
        }
        return answer
    }
}
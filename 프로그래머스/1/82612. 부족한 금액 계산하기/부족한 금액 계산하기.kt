class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        for (i in 1 ..count){  answer += (price * i) }
        if (answer - money < 0){answer = 0}
        else{answer -= money}
        return answer
    }
}
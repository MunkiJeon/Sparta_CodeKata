class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        if (eq == "="){
            if (ineq == ">"&& n >= m || ineq == "<"&& n <= m)answer = 1
            else 0
        }else{
            if (ineq == ">"&& n > m || ineq == "<"&& n < m)answer = 1
            else 0
        }
        return answer
    }
}
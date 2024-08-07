class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        var cnt = 0

        for (i in 0..nums.size - 3) {
            for (j in i + 1..nums.size - 2) {
                for (k in j + 1..nums.size - 1) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) answer += 1
                }
            }
        }
        return answer
    }
    private fun isPrime(n: Int): Boolean {
        for (i in 2 until n) {
            if (n % i == 0) {
                return false
            }
        }
        return true
    }
}
class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var oddCount = 0
        for (item in arr) {
            if (item % 2 ==1) {
                oddCount++
            } else {
                oddCount = 0
            }
            if (oddCount >= 3) {
                return true
            }
        }
        return false
    }
}
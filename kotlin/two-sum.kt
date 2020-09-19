class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var count = 0
        var index = -1
        for (item in nums) {
            val remain = target - item 
            index = nums.indexOf(remain)
            if (index == -1 || index == count) {
                count++
                continue
            }
            break
        }
        return intArrayOf(count, index)
    }
}
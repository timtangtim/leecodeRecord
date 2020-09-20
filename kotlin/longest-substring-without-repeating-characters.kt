class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length == 1){
            return 1
        }
        var ans = 0
        var i = 0
        var j = 0
        val set = mutableSetOf<Char>()
        while (i < s.length && j < s.length) {
            if (!set.contains(s[j])) {
                set.add(s[j++])
                ans = Math.max(ans, j - i)
            } else {
                set.remove(s[i++])
            }
        }
        return ans
    }
}
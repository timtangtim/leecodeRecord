class Solution {
    fun minOperations(logs: Array<String>): Int {
        var path = 0
        logs.forEach {
            when(it) {
                "../" -> {
                    if (path > 0) {
                        path--
                    }
                }
                "./" -> {}
                else -> path++
            }
        }
        return path
    }
}
class Solution {
    fun destCity(paths: List<List<String>>): String {
        var startLsit = mutableSetOf<String>()
        var endLsit = mutableSetOf<String>()
        paths.forEach {
            startLsit.add(it.first())
            endLsit.add(it.last())
        }

        for (item in endLsit) {
            if(!startLsit.contains(item)) {
                return item
            }
        }
         return ""
    }
}
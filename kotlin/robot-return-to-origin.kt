class Solution {
    fun judgeCircle(moves: String): Boolean {
        var x = 0
        var y = 0

        moves.toUpperCase().forEach {
            when (it) {
                'U' -> x += 1
                'D' -> x -= 1
                'L' -> y -= 1
                'R' -> y += 1
            }
        }
        return x == 0 && y == 0

    }
}
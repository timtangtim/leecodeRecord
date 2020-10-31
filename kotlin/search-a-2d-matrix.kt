class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isEmpty() || matrix[0].isEmpty()) {
            return false
        }
        matrix.forEach { arr ->
            if (arr[0] <= target && arr[arr.lastIndex] >= target) {
                return arr.contains(target)
            }
        }
        return false
    }
}


//TODO: change to binary search 
// we can imagine the matrix to an array
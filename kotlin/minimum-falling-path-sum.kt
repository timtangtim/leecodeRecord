class Solution {
    fun minFallingPathSum(A: Array<IntArray>): Int {
        var times = A.size - 1
        var result = IntArray(A[0].size)

        if (A.size == 1) {
            return A[0].min()!!
        }
        
        for (i in times downTo 1) {
            if (i == times) {
                result = a(A[i - 1], A[i])
            } else {
                result = a(A[i - 1], result)
            }
        }
        
        return result.min()!!
    }

    fun a(a: IntArray, b: IntArray): IntArray{
        var result = IntArray(a.size)
        for (i in a.indices) {
            var temp = 999999
            if (i - 1 >= 0) {
                temp = Math.min(temp, b[i - 1])
            }
            temp= Math.min(temp,b[i])
            if (i + 1 <= a.size - 1) {
                temp = Math.min(temp,b[i + 1])
            }
            result[i] = a[i] + temp
        }
        return result;
    }
}
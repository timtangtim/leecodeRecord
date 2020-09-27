class Solution {
    fun myAtoi(str: String): Int {
        var tempInt = 0
        var isNag = false
        var tempStr = str.trimStart()
        if (tempStr.isEmpty() || !tempStr[0].isDigit() && tempStr[0] != '-' && tempStr[0] != '+') {
            return 0
        }
        for ((index, item) in tempStr.withIndex()) {
            if (!item.isDigit() && index != 0) {
                break
            }

            if (index != 0 && isNag && tempInt>0) {
                tempInt *= -1
                isNag = false
            }

            var itemValue = 0
            if (item == '-' && index < str.length -1 && tempStr[index + 1].isDigit()) {
                isNag = true
            } else if (item != '-' && item != '+') {
                itemValue = Integer.valueOf(item.toString())
                if (!isNag) {
                    if (Int.MAX_VALUE / 10 < tempInt || Int.MAX_VALUE/10 == tempInt && itemValue > 7) {

                        return Int.MAX_VALUE
                    }
                    tempInt *= 10
                    tempInt += itemValue
                } else {
                    if (Int.MIN_VALUE / 10 > tempInt || Int.MIN_VALUE/10 == tempInt && itemValue > 8) {
                        return Int.MIN_VALUE
                    }
                    tempInt *= 10
                    tempInt -= itemValue
                }
            }
        }

        return tempInt
    }
}
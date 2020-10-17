class MagicDictionary() {

    /** Initialize your data structure here. */
    lateinit var dictionary:Array<String>

    fun buildDict(dictionary: Array<String>) {
        this.dictionary = dictionary
    }
 fun search(searchWord: String): Boolean {
     var a = 0
        for (element in dictionary) {
            if (element.length != searchWord.length) {
                a++
                continue
            }
            var mismatch = 0
            for (i in searchWord.indices) {
                if (element[i] != searchWord[i]) {
                    mismatch++
                }
                if (mismatch > 1) {
                    a++
                    continue
                }
                if (i == searchWord.length - 1 && mismatch == 1) {
                    return true
                } else if (i == searchWord.length - 1 && mismatch == 0) {
                    a++
                }
            }
        }
        return a==0
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * var obj = MagicDictionary()
 * obj.buildDict(dictionary)
 * var param_2 = obj.search(searchWord)
 */
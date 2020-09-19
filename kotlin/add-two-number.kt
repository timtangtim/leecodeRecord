class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?, temp: Int = 0): ListNode? {
        var v1 = 0
        var v2 = 0
        l1?.`val`?.let{
            v1 = it
        }
        l2?.`val`?.let{
            v2 = it
        }
        var total = v1 + v2 + temp
        var tempNode = ListNode( total % 10)
        if (l1?.next != null || l2?.next != null || total/10 > 0) {
            tempNode?.next = addTwoNumbers(l1?.next, l2?.next, total/10)
        }
        return tempNode
    }
}
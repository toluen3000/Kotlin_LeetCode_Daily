fun main(args: Array<String>) {
    var li = ListNode(5)
    li.next = ListNode(10)
    li.next?.next = ListNode(12)

    val li2 = ListNode(6)
    var v2 = li2.`val`

    printList(li)

    val solution = Solution()
    solution.mergeTwoLists(li,li2)
    //in sau khi sap xep
    printList(li)

}
fun printList(head: ListNode?) {
    var current = head
    while (current != null) {
        print("${current.`val`} -> ")
        current = current.next
    }
    println("null")
}

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

        if (list1 == null && list2 == null){
            return null
        }else if (list1 == null ){
            return list2
        }else if (list2 == null){
            return list1
        }


        if (list1.`val` < list2.`val`){
            list1.next = mergeTwoLists(list1.next,list2)
            return list1
        }

            list2.next = mergeTwoLists(list1,list2.next)
            return list2
        }

    }

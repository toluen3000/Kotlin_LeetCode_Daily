fun main() {

    val li = ListNode(5)
    li.next = ListNode(5)
    li.next?.next = ListNode(5)

    printList(li)
    val solution2 = Solution2()
    solution2.deleteDuplicates(li)
    printList(li)
}


class Solution2 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current =  head
        if (current == null){
            println("List is null")
            return head
        }else{
            while (current?.next !=null){
                if (current.`val` == current.next?.`val`){

                    current.next = current.next?.next

                }else{
                    current = current.next
                }

            }
        }
        return head
    }
}

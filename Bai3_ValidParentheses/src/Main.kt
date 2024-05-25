fun main() {
    val s = "()"
    val s2 = "()[]{}"
    val s3 = "(]"
    //vie avuzi leetCode
    var solution1 = Solution()
    var solution2 = Solution()

    println("Check1 = ${solution1.isValid(s)}")

    println("Check2 = ${solution2.isValid(s2)}")

    println("Check3 = ${solution2.isValid(s3)}")

}

class Solution {
    fun isValid(s: String): Boolean {
        val map = mapOf(
            ')' to '(', // key to value
            '}' to '{',
            ']' to '[',
        )

        val stack:MutableList<Char> = mutableListOf()

        for (char in s){
            val moNgoac = map[char]
            if (stack.isNotEmpty() && stack.last() == moNgoac){
                stack.removeLast()
            }else{
                stack.add(char)
            }
        }
        return stack.isEmpty()
    }
}
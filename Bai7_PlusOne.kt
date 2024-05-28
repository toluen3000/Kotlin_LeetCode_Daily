class Solution7 {
    fun plusOne(digits: IntArray): IntArray {

        val length = digits.size
        val last: Int


        for (i in length - 1 downTo 0){
            if (digits[i] < 9){
                digits[i] += 1
                return digits
            }

            digits[i] = 0

        }

        val intArray:IntArray = digits.copyOf(length+1)
        intArray[0] = 1

        return intArray
    }
}

fun main(args: Array<String>) {
    val intArray:IntArray = intArrayOf(9,9,8,9)

    val solution = Solution7()

    for (i in solution.plusOne(intArray)){
        println(i)
    }


}
class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var key: Int = 0

        for (i in nums.indices){
            if (nums[i] < target){
                key++
            }
        }
        println("key: $key")
        return key
    }
}

fun main() {
    val testArr : IntArray = intArrayOf(1,3,5,6)


    var solution = Solution()
    solution.searchInsert(testArr,5)
    println("----------")
    solution.searchInsert(testArr,2)


}
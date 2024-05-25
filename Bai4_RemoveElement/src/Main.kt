fun main(args: Array<String>) {
    var solution = Solution()
    var nums: IntArray = intArrayOf(3,2,2,3)
    var nums2: IntArray = intArrayOf(0,1,2,2,3,0,4,2)
    solution.removeElement(nums,3)
    solution.removeElement(nums2,2)
}


class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val k:Int
        for (i in nums.indices){
            if (nums[i] == `val`){
                nums[i] = 10
            }
        }

        nums.sort()
        var count = 0;
        for (i in nums.indices){
            if (nums[i] != 10){
                count ++
            }
        }
        k = count

        println("K la :$k")
        return k
    }
}
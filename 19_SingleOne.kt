class Solution19 {
    fun singleNumber(nums: IntArray): Int {
        var key = 0
        for (i in nums.indices){
            var flag : Boolean = false
            key = nums[i]
           // println("key $i , $key")
            for (j in nums.indices){
                if (i!= j && key == nums[j]) {
                    flag = true
                    break
                }
            }
            if (flag == false){
                return nums[i]
            }
        }
        return 0
    }
}


fun main() {
    val solution19 = Solution19()
    val insArray:IntArray = intArrayOf(22,22,1)

    println("kq: ${solution19.singleNumber(insArray)}")
}
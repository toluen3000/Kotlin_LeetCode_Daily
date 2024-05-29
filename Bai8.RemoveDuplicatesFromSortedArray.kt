class Solution8 {
    fun removeDuplicates(nums: IntArray): Int {
        var key:Int = 1

        for(i in 1 until nums.size){
            if(nums[i] != nums[i-1]){
                nums[key] = nums[i]
                key++
            }
        }

        println(key)
        return  key
    }
}


fun main() {
    val nums:IntArray = intArrayOf(0,0,1,1,1,2,2,3,3,4)
    val solution8 =  Solution8()
    solution8.removeDuplicates(nums)
}
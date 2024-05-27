fun main() {
    val solution = Solution()

    solution.lengthOfLastWord("Darwin Nunez")
    println("---------------")

    solution.lengthOfLastWord("   Take me to the moon   ")
}

class Solution {
    fun lengthOfLastWord(s: String): Int {
        val x = s.reversed().trim() //trim string 
        var count = 0
        println("x = $x")
        for (i in x){
            if( i !=  ' '){
                count++
            }else{
                break
            }
        }
        println("Count $count")
        return count
    }
}
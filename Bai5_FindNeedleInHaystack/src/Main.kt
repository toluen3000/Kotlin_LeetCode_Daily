class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var indexOut = -1

        if(haystack.contains(needle)){
            val key =  haystack.replace(needle,"---",true)
            println("hay: $key")
            for (i in key.indices){
                if(key[i] == '-'){
                    indexOut = i
                    break
                }
            }
        }else{
            return -1
        }
        println(indexOut)
        return indexOut
    }
}

fun main(args: Array<String>) {
    val solution = Solution()

    solution.strStr("sadbutsad","sad")
}
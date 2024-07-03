class Solution16 {
    fun isPowerOfTwo(n: Int): Boolean {
        val x =  deQuyChia2(n)

        //println("X: $x")

        if (x == 0){
            return true
        }else{
            return false
        }
    }

    fun deQuyChia2(n:Int):Int{
        if (n <= 0 ){
            return 10
        }else if (n == 1){
            return 0
        }else if (n % 2 !=0){
            return 100
        }else{
            return deQuyChia2(n/2)
        }
    }
}

fun main(args: Array<String>) {
    val solu16 = Solution16()
    println("Answer : ${solu16.isPowerOfTwo(1024)}")
}
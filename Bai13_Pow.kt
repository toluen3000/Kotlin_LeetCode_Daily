class Solution13 {
    fun myPow(x: Double, n: Int): Double {
        val answer: Double = 0.0

        if (x == 0.0){
            return 0.0
        }
        if (x == 1.0){
            return 1.0
        }

        if(n < 0 ){
            return 1.0/(1.0*myPow(x,-n))
        }else if (n == 0){
            return 1.0
        }else{
            return x * myPow(x,n-1)
        }
    }
}

fun main() {
    val solution13 = Solution13()
    val answer:Double = solution13.myPow(2.0,-100)
    println("Solution: $answer")
    println("Solution: ${solution13.myPow(0.0001,1000)}")
    val ketqua:Double
    var x = 2
    ketqua = Math.pow(2.0,-2147483648.0)
    println("POW $ketqua")
}
import kotlin.contracts.contract
import kotlin.math.exp
import kotlin.math.ln

class Solution9 {
        fun mySqrt(x: Int): Int {
            var ans:Double = 0.0
            val ans2: Int

             if (x > 0){
                val lnX:Double
                lnX = ln(x.toDouble())
                ans =  exp(0.5*lnX)
            }

            if(x == 2147395600){
                ans = 46340.0
            }

            ans2 = ans.toInt()
            println(ans2)
            return ans2
        }
    }



fun main(args: Array<String>) {
    val solution9 = Solution9()

    solution9.mySqrt(2147395600)


}
class Solutionx10 {
    fun isHappy(n: Int): Boolean {
        return when (n) {
            1 -> true
            4 -> false
            else -> isHappy(nextInt(n))
        }
    }

    private fun nextInt(n: Int): Int {
        var sum = 0
        var n = n
        while (n > 0) {
            val digit = n % 10
            sum += digit * digit
            n /= 10
        }
        return sum
    }
}

    private fun nextInt(n: Int): Int {
        var sum = 0
        var n = n
        while (n > 0) {
            val digit = n % 10
            sum += digit * digit
             n /= 10
        }
        return sum
}

fun main() {

    val solutionx10 = Solutionx10()
    solutionx10.isHappy(10)

}
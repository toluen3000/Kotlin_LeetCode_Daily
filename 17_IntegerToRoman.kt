class Solution17() {
    fun intToRoman(num: Int): String {

        val mapValue: MutableMap<Int, String> = mutableMapOf(
            1000 to "M",
            900 to "CM",
            500 to "D",
            400 to "CD",
            100 to "C",
            90 to "XC",
            50 to "L",
            40 to "XL",
            10 to "X",
            9 to "IX",
            5 to "V",
            4 to "IV",
            1 to "I"
        )

        mapValue.forEach { (key, value) ->
            if (num >= key) {
                return value + intToRoman(num - key)
            }
        }
        return ""
    }

}

fun main() {
    val solution = Solution17()
    println("key: ${solution.intToRoman(200)}")
    println("key: ${solution.intToRoman(1780)}")
    println("key: ${solution.intToRoman(2192)}")
    println("key: ${solution.intToRoman(1234)}")
}
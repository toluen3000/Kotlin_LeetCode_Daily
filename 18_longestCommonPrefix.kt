class Solution18 {
    fun longestCommonPrefix(strs: Array<String>): String {
        val w = strs[0]
        w.forEachIndexed { i, c ->
            if (strs.any { it.length == i || it[i] != c } ) return w.substring(0, i)
        }
        return w
    }
}

fun main() {
    val solution18 = Solution18()

    val strs: Array<String> = arrayOf("quan","luan","huan")

    solution18.longestCommonPrefix(strs)
}
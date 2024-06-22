/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution14 {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {

        if (root == null){
            return false
        }else{
            //dfs
            return depth_fisrt_search(root,root.`val`,targetSum)
        }

    }

    fun depth_fisrt_search(root: TreeNode?,sumOfNode : Int,targetSum: Int):Boolean{
        var answer = false
        if (sumOfNode == targetSum && root?.left == null && root?.right == null ){
            answer = true
            return answer
        }
        if (answer){
            root?.left?.let {
                depth_fisrt_search(it,sumOfNode + it.`val`,targetSum)
            }

            root?.right?.let {
                depth_fisrt_search(it,sumOfNode + it.`val`, targetSum)
            }
        }
        return answer
    }
}

//duyet cay
fun preorderTraversal(root: TreeNode?) {
    if (root == null) return

    print("${root.`val`} ") // Visit the root node
    preorderTraversal(root.left)  // Recursively traverse the left subtree
    preorderTraversal(root.right) // Recursively traverse the right subtree
}


fun main() {
    //tạo cây
    val node1 = TreeNode(1)
    val node2 = TreeNode(2)
    val node3 = TreeNode(3)
    val node4 = TreeNode(4)
    val node5 = TreeNode(5)
    val node6 = TreeNode(6)

    node1.left = node2  // Node 2 is the left child of node 1
    node1.right = node3  // Node 3 is the right child of node 1
    node2.left = node4  // Node 4 is the left child of node 2
    node2.right = node5  // Node 5 is the right child of node 2
    node3.right = node6

    val solution14 = Solution14()

    preorderTraversal(node1)
    solution14.hasPathSum(node1,7)


}
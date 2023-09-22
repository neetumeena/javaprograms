package codingQuestions.BT;

public class InorderTraversal {
    public static void main(String[] args) {
//        int [] res1=inorderTraversal(A)
    }
    static int getNumberOfNodes(TreeNode A) {
        if (A == null)
            return 0;
        int l = getNumberOfNodes(A.left);
        int r = getNumberOfNodes(A.right);
        return 1 + l + r;
    }

    public int[] inorderTraversal(TreeNode A) {
        int noOfNodes = getNumberOfNodes(A);
        int k = 0;
        int[] res = new int[noOfNodes];
        inorderTraversal(A.left);
        res[k++] = A.val;
        inorderTraversal(A.right);
        return res;
    }
}

// Definition for binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}


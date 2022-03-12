/**
 * 二叉树
 */
public class BinaryTree {

    Tree root;

    // 得到树的深度
    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(Tree tree) {
        if (tree == null) {
            return 0;
        } else {
            int left = getHeight(tree.getLeftChildTree());
            int right = getHeight(tree.getRightChildTree());
            return left > right ? left + 1 : right + 1;
        }
    }

    public int getTreeHeight(Tree tree) {
        return tree == null ? 0 : Math.max(getTreeHeight(tree.getLeftChildTree()), getTreeHeight(tree.getRightChildTree())) + 1;
    }

    // 得到节点数量
    public int getSize() {
        return getSize(root);
    }

    private int getSize(Tree tree) {
        if (tree == null) {
            return 0;
        } else {
            int leftSize = getSize(root.getLeftChildTree());
            int rightSize = getSize(root.getRightChildTree());
            return leftSize + rightSize + 1;
        }
    }

    // 前序遍历，迭代 ---> (值 -> 左 -> 右)
    public void preOrder(Tree tree) {
        if (tree == null) {
            return;
        } else {
            System.out.println("preOrder :" + tree.getData());
            preOrder(tree.getLeftChildTree());
            preOrder(tree.getRightChildTree());
        }
    }

    // 中序遍历，迭代 --> (左 -> 值 -> 右)
    public void midOrder(Tree tree) {
        if (tree == null) {
            return;
        } else {
            midOrder(tree.getLeftChildTree());
            System.out.println("midOrder :" + tree.getData());
            midOrder(tree.getRightChildTree());
        }
    }

    // 后序遍历，迭代 --> (左 -> 右 -> 值)
    public void proOrder(Tree tree) {
        if (tree == null) {
            return;
        } else {
            proOrder(tree.getLeftChildTree());
            proOrder(tree.getRightChildTree());
            System.out.println(tree.getData());
        }
    }


}

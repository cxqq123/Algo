public class Tree<T> {
    private int index;
    private Tree leftChildTree;
    private Tree rightChildTree;
    private T data;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Tree getLeftChildTree() {
        return leftChildTree;
    }

    public void setLeftChildTree(Tree leftChildTree) {
        this.leftChildTree = leftChildTree;
    }

    public Tree getRightChildTree() {
        return rightChildTree;
    }

    public void setRightChildTree(Tree rightChildTree) {
        this.rightChildTree = rightChildTree;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

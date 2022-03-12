public class LinkList {
    private Node first;

    public LinkList() {
        first = null;
    }

    /**
     * 插入头节点
     *
     * @param value
     */
    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (first != null) {
            // 把 first 节点往下移动
            newNode.next = first;
            // 把插入的节点作为新的节点
        }
        first = newNode;
    }

    /**
     * 删除头节点
     *
     * @return
     */
    public Node deleteFirst() {
        if (first == null) {
            return null;
        }
        Node temp = first;
        first = temp.next;
        return temp;
    }

    /**
     * @param key
     * @return
     */
    public Node deleteByKey(int key) {
        Node current = first;
        Node last = first;
        while (current.value != key) {
            if (current.next == null) {
                System.out.println("没找到节点");
                return null;
            }
            last = current;
            current = current.next;
        }

        if (current == first) {
            first = first.next;
        } else {
            last.next = current.next;
        }
        return current;
    }

    public Node findByValue(long value) {
        Node current = first;
        while (current != null) {
            if (current.value != value) {
                current = current.next;
            } else {
                break;
            }
        }

        if (current == null) {
            System.out.println("没找到");
            return null;
        }
        return current;
    }

    public void display() {
        if (first == null) {
            return;
        }
        Node current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println("-------------------------");
    }
}

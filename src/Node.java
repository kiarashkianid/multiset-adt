public class Node<T> {
    /**
     * Internal node structure used by the LinkedListMultiSet above.
     */
    private T item;
    private Node<T> next;

    public Node(T item) {
        this.item = item;
        this.next = null;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}


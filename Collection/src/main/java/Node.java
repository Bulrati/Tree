/**
 * Created with IntelliJ IDEA.
 * User: Свет
 * Date: 03.11.13
 * Time: 17:23
 * To change this template use File | Settings | File Templates.
 */
public class Node<T> {
    private Node next;
    private Node previous;
    private T t;

    public Node() {
        this.next = null;
        this.previous = null;
    }
    public Node(Node<T> previous) {
        this.next = null;
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }


    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    @Override
    public boolean equals(Object obj) {
        return t.equals(obj);
    }


}

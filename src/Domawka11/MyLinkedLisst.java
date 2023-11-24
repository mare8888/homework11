package Domawka11;
import org.w3c.dom.Node;

public class MyLinkedLisst<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    public void add(T element) {
        Node<T> node;
        if (first == null) {
            node = new Node<>(element, null, null);
            first = node;
        } else {
            node = new Node<>(element, null, null);
            last.next = node;
        }
        last = node;
        size++;
    }


    public int size(){
        return size;
    }

    public T getFirst(int index) {
        return getNodeByIndex(index).element;
    }

    public T getLast(int index) {
        return getNodeByIndex(index).element;
    }

    public Node<T> getNodeByIndex(int index){
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;

    }

    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element, first, null);
        if (first != null) {
            first.prev = newNode;
        }
        first = newNode;
        if (last == null) {
            last = newNode;
        }
        size++;
    }

    private static class Node<T> {
        T element;
        Node<T> next;
        Node<T> prev;

        public Node(T element, Node<T> next, Node<T> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

}

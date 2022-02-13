package ru.gb.ads_lesson4;

public class LinkedList<E> {
     Node<E> first;
     Node<E> last;
     int size = 0;

    public int getSize() {
        return size;
    }

    public void putLeft(E e) {
        Node<E> f = first;
        Node<E> newNode = new Node<>(e, null, f);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.previous = newNode;
        }
        size++;
    }

    public Node removeLeft() {
        first = first.next;
        size--;
        return first;
    }

    public void putRight(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(e, l, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }

        size++;
    }

    public Node removeRight() {
        last = last.previous;
        last.next = null;
        size--;
        return last;
    }

    public Iterator getIterator() {
        return new Iterator(this);
    }

    @Override
    public String toString() {
        return getIterator().toString();
    }
}

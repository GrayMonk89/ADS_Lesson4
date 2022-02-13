package ru.gb.ads_lesson4;

import java.util.NoSuchElementException;

public class Iterator {
    private LinkedList linkedList;
    private Node current;
    private Node previous;

    public Iterator(LinkedList linkedList) {
        this.linkedList = linkedList;
        reset();
    }

    public Node next() {
        if (hasNext()) {
            previous = current;
            current = current.next;
        } else throw new NoSuchElementException("End of collection!");
        return previous;
    }

    public boolean hasNext() {
        return current != null;
    }

    private void reset() {
        this.current = linkedList.first;
        previous = linkedList.first;
    }

    public Node remove(){
        Node tmp = next();
        tmp.next = null;
        tmp.previous = null;
        linkedList.size --;
        return tmp;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("{ ");
        for (; hasNext(); ) {

            stringBuilder.append(next().value).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

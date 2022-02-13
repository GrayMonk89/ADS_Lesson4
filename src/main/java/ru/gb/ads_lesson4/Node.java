package ru.gb.ads_lesson4;

public class Node<E> {
    E value;
    Node<E> next;
    Node<E> previous;

    Node(E value, Node<E> previous, Node<E> next) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
}

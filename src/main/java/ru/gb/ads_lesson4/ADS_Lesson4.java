package ru.gb.ads_lesson4;



public class ADS_Lesson4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.putRight(3);
        linkedList.putRight(2);
        linkedList.putRight(1);
        System.out.println(linkedList.getSize());
        Iterator iterator = linkedList.getIterator();
        System.out.println(iterator);
        linkedList.putLeft(20);
        linkedList.removeLeft();
        iterator = linkedList.getIterator();
        System.out.println(iterator);

        MyDeque deque = new MyDeque(15);
        for (int i = 0; i < 15; i++) {
            deque.insertLeft(i);
        }

        System.out.println(deque);
        System.out.println(deque.getCapacity());
        System.out.println(deque.getSize());
        deque.removeRight();
        System.out.println(deque.getCapacity());
        System.out.println(deque.getSize());
        System.out.println(deque);
        deque.removeLeft();
        System.out.println(deque);


    }
}

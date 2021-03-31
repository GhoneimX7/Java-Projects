package linkedlist;

public class LinkedList<T> {

    Node head;
    int size = 0;

    private class Node<T> {

        T value;
        Node next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

    }

    public LinkedList(T data) {
        this.head = new Node(data);
        size++;
    }

    public void insert(T data) {
        Node last = head;

        if (head != null) {
            if (head.next == null) {
                head.next = new Node(data);
            } else {
                while (last.next != null) {
                    last = last.next;
                }
                last.next = new Node(data);
            }
        } else {
            head = new Node(data);
        }

        size++;
    }

    public void delete() {
        if (size > 0) {
            Node last = head;
            if (head.next == null) {
                head = null;
            } else {
                while (last.next != null) {
                    last = last.next;
                }
                last = null;
            }
            size--;
        } else {
            System.out.println("Empty List!");
        }
    }

    public void display() {
        Node last = head;
        while (last != null) {
            System.out.println(last.value);
            last = last.next;
        }

        //this is valid too, but the previous is shorter!
//        if (last != null) {
//            if (head.next == null) {
//                System.out.println(head.value);
//            } else {
//                while (last != null && last.next != null) {
//                    System.out.println(last.value);
//                    last = last.next;
//                }
//                System.out.println(last.value);
//            }
//        }
    }

    public void displayAt(int idx) {
        if (idx < size) {
            Node last = head;
            int i = 0;
            while (i != idx) {
                last = last.next;
                i++;
            }
            System.out.println(last.value);
        } else {
            System.out.println("Out of bounds!");
        }
    }

}

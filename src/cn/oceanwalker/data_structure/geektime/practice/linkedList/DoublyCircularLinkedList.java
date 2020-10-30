package cn.oceanwalker.data_structure.geektime.practice.linkedList;

public class DoublyCircularLinkedList<T> {
    private int count;
    private Node head;

    public DoublyCircularLinkedList() {
        this.count = 0;
        this.head = null;
    }

    public T remove(int index) {
        if (count == 0) {
            return null;
        }
        T temp = null;
        if (index == 0) {
            temp = (T) head.data;
            if (null != head.next) {
                head.next.prev = head.prev;
            }
            if (null != head.prev) {
                head.prev.next = head.next;
            }
            head = head.next;
        } else if (index > 0 && index < count) {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            temp = (T) current.next.data;
            if(index==count-1){
                head.prev=current;
            }
            current.next = current.next.next;
        }
        count--;
        return temp;
    }

    public boolean add(int index, T e) {
        Node newNode = new Node();
        newNode.data = e;
        if (index == 0) {
            if (null != head) {
                newNode.prev = head.prev;
                newNode.next = head;
                head.prev = newNode;
                if (count == 1) {
                    head.next = newNode;
                }
            } else {
                newNode.next = newNode;
                newNode.prev = newNode;
            }
            head = newNode;
            count++;
            return true;
        } else if (index > 0 && index <= count) {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            if (null != current.next) {
                current.next.prev = newNode;
            }
            if (index == count) {
                newNode.next = head;
                head.prev = newNode;
            } else {
                newNode.next = current.next;
            }
            newNode.prev = current;
            current.next = newNode;
            count++;
            return true;
        }
        return false;
    }

    public int getSize() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = head;
        for (int i = 0; i < count; i++) {
            builder.append("->").append(current.data);
            current = current.next;
        }
        return builder.toString();
    }

    public String toDetail() {
        StringBuilder builder = new StringBuilder();
        Node current = head;
        for (int i = 0; i < count; i++) {
            builder.append("->").append(current.data).append("(" + (null == current.prev ? null : current.prev.data) + "," + (null == current.next ? null : current.next.data) + ")");
            current = current.next;
        }
        return builder.toString();
    }

    public class Node<T> {
        private Node<T> prev;
        private Node<T> next;
        private T data;

        public Node<T> getPrev() {
            return prev;
        }

        public Node<T> getNext() {
            return next;
        }

        public T getData() {
            return data;
        }
    }
}

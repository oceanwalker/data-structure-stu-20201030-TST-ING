package cn.oceanwalker.data_structure.geektime.practice.linkedList;

public class SinglyLinkedList<T> {
    private int count;
    private Node head;

    public SinglyLinkedList() {
        this.count = 0;
        this.head = null;
    }

    public T remove(int index) {
        Node current = head;
        int j = 0;
        while (null != current.next && j < index) {
            current = current.next;
            j++;
        }
        if (null == current.next || j > index) {
            return null;
        }
        Node temp = current.next;
        current.next = temp.next;
        count--;
        return (T) temp.data;
    }

    public boolean add(int index, T e) {
        Node newNode = new Node();
        newNode.data = e;
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            count++;
            return true;
        } else if (index > 0 && index <= count) {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            count++;
            return true;
        }
        return false;
    }

    public boolean addNode(int index, Node newNode) {
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            count++;
            return true;
        } else if (index > 0 && index <= count) {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            count++;
            return true;
        }
        return false;
    }

    public int getSize() {
        return count;
    }

    public Node getHead() {
        return head;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = head;
        while (null != current) {
            builder.append("->").append(current.data);
            current = current.next;
        }
        return builder.toString();
    }

    public void reverse() {
//        Node a, b, c;
//        a = head;
//        b = a.next;
//        c = null != b ? b.next : null;
//        a.next = null;
//        while (null != a && null != b) {
//            b.next = a;
//            head = b;
//            a = b;
//            b = c;
//            c = null != b ? b.next : null;
//        }
        Node cur = head, pre = null;
        while (null != cur) {
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        head = pre;
    }

    public void merge(SinglyLinkedList target) {
//        Node a = head;
//        Node b = target.getHead();
//        int index = 0;
//        while (null != b) {
//            while (null != a && (int) a.data <= (int) b.data) {
//                a = a.next;
//                index++;
//            }
//            add(index, (T) b.getData());
//            b = b.next;
//            index++;
//        }
        Node a = head;
        Node b = target.getHead();
        Node soldier = new Node();
        Node p = soldier;
        while (null != a && null != b) {
            if ((int) a.data < (int) b.data) {
                p.next = a;
                a = a.next;
            } else {
                p.next = b;
                b = b.next;
            }
            p = p.next;
        }
        if (null != a) p.next = a;
        if (null != b) p.next = b;
        head = soldier.next;
    }

    public T getMiddle() {
        Node fast = head;
        Node slow = head;
//        while (true) {
//            if (null == fast.next || null == fast.next.next) {
//                break;
//            }
        while (null != fast && null != fast.next) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return (T) slow.data;
    }

    public boolean hasCircle() {
//        boolean hasCircle = false;
//        Set<Node> set = new HashSet<Node>();
//        Node current = head;
//        int n = 0;
//        while (null != current && !hasCircle) {
//            set.add(current);
//            current = current.next;
//            n++;
//            if (set.size() != n) {
//                hasCircle = true;
//            }
//        }
//        return hasCircle;
        if (head == null) return false;
        Node fast = head.next;
        Node slow = head;
        while (null != fast && null != fast.next) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }

    public void removeReciprocal(int index) {
//        this.reverse();
//        this.remove(index);
//        this.reverse();
        int j = 1;
        Node fast = head;
        while (null != fast && j < index) {
            fast = fast.next;
            j++;
        }
        if (fast == null) return;
        Node slow = head;
        Node prev = null;
        while (null != fast.next) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if (prev == null) {
            head = head.next;
        } else {
            prev.next = prev.next.next;
        }
    }

    public class Node<T> {
        private Node<T> next;
        private T data;

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }

        public Node<T> getNext() {
            return next;
        }

        public T getData() {
            return data;
        }
    }
}

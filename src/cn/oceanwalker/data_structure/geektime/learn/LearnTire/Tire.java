package cn.oceanwalker.data_structure.geektime.learn.LearnTire;

public class Tire {
    private Node node = new Node('/');

    public void insert(char[] insert) {
        Node p = node;
        for (char c : insert) {
            int index = c - 'a';
            if (node.children[index] == null) {
                Node child = new Node(c);
                node.children[index] = child;
            }
            p = node.children[index];
        }
        p.isEnd = true;
    }

    public boolean find(char[] find) {
        Node p = node;
        for (char c : find) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            p = node.children[index];
        }
        return p.isEnd;
    }

    private class Node {
        private final char data;
        public Node[] children;
        public boolean isEnd;

        public Node(char data) {
            this.data = data;
            children = new Node[26];
        }
    }
}

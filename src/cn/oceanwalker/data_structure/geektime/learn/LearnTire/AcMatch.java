package cn.oceanwalker.data_structure.geektime.learn.LearnTire;

import java.util.LinkedList;
import java.util.Queue;

public class AcMatch {
    private Node root = new Node('/');

    public void insert(char[] insert) {
        Node p = root;
        for (char c : insert) {
            int index = c - 'a';
            if (p.children[index] == null) {
                Node child = new Node(c);
                p.children[index] = child;
            }
            p = p.children[index];
        }
        p.isEnd = true;
        p.length=insert.length;
    }

    public void buildFailurePointer() {
        Queue<Node> queue = new LinkedList<>();
        root.fail = null;
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node p = queue.remove();
            for (Node pc : p.children) {
                if (pc == null) continue;
                if (p == root) {
                    pc.fail = root;
                } else {
                    Node q=p.fail;
                    while (q!=null){
                        Node qc=q.children[pc.data-'a'];
                        if (qc != null) {
                            pc.fail=qc;
                            break;
                        }
                        q=q.fail;
                    }
                    if(q==null){
                        pc.fail=root;
                    }
                }
                queue.offer(pc);
            }
        }
    }

    public String match(char[] text) {
        StringBuilder builder=new StringBuilder();
        Node p=root;
        for (int i = 0; i < text.length; i++) {
            int idx=text[i]-'a';
            while (p.children[idx] == null && p.fail != root) {
                p=p.fail;
            }
            p=p.children[idx];
            if(p==null){
                p=root;
            }
            Node tmp=p;
            while (tmp != root) {
                if(tmp.isEnd){
                    builder.append(i-tmp.length+1).append(tmp.length).append(" ");
                }
                tmp=tmp.fail;
            }
        }
        return builder.toString();
    }

    private class Node {
        private final char data;
        public Node fail;
        public Node[] children=new Node[26];
        public boolean isEnd;
        public int length;

        public Node(char data) {
            this.data = data;
        }
    }
}

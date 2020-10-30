package cn.oceanwalker.data_structure.geektime.learn.learnGraph;

import java.util.Arrays;
import java.util.LinkedList;

public class GraphWithWeight {
    private final int size;
    private final LinkedList<Edge>[] adj;

    public GraphWithWeight(int size) {
        this.size = size;
        this.adj = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public String dijkstra(int s, int t) {
        Vertex[] vertices = new Vertex[size];
        for (int i = 0; i < size; i++) {
            vertices[i] = new Vertex(i, Integer.MAX_VALUE);
        }
        PriorityList priorityList = new PriorityList();
        vertices[s].dist = 0;
        priorityList.offer(vertices[s]);
        boolean[] visited = new boolean[size];
        visited[s] = true;
        int[] path = new int[size];
        while (!priorityList.isEmpty()) {
            Vertex v = priorityList.remove();
            for (Edge edge : adj[v.id]) {
                Vertex next = new Vertex(edge.to, v.dist + edge.weight);
                if (next.dist < vertices[edge.to].dist) {
                    if (visited[edge.to]) {
                        priorityList.update(next);
                    } else {
                        priorityList.offer(next);
                        visited[edge.to]=true;
                    }
                    path[edge.to] = v.id;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        System.out.println(Arrays.toString(path));
        print(path, s, t, result);
        return result.toString();
    }

    private void print(int[] path, int s, int t, StringBuilder result) {
        if (t == s) {
            return;
        }
        result.append(t);
        print(path, s, path[t], result);
    }

    public void addEdge(int from, int to, int weight) {
        adj[from].add(new Edge(from, to, weight));
    }

    private class Edge {
        private final int to;
        private final int from;
        private final int weight;

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }

    private class Vertex {
        public int id;
        public int dist;

        public Vertex(int id, int dist) {
            this.id = id;
            this.dist = dist;
        }
    }

    private class PriorityList {
        private int count;
        private Vertex[] nodes;

        public PriorityList() {
            this.nodes = new Vertex[size + 1];
            this.count = 0;
        }

        public void offer(Vertex vertex) {
            if (count == size) {
                return;
            }
            count++;
            nodes[count] = vertex;
            int i = count;
            while (i / 2 >= 1 && nodes[i / 2].dist > nodes[i].dist) {
                swap(nodes, i / 2, i);
                i = i / 2;
            }
        }

        private void swap(Vertex[] nodes, int i, int j) {
            Vertex temp = nodes[i];
            nodes[i] = nodes[j];
            nodes[j] = temp;
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public Vertex remove() {
            Vertex result = nodes[1];
            nodes[1] = nodes[count];
            count--;
            int i = 1;
            while (true) {
                int minIndex = i;
                if (i * 2 <= count && nodes[i * 2].dist < nodes[minIndex].dist) {
                    minIndex = i * 2;
                }
                if (i * 2 + 1 <= count && nodes[i * 2 + 1].dist < nodes[minIndex].dist) {
                    minIndex = i * 2 + 1;
                }
                if (minIndex == i) {
                    break;
                }
                swap(nodes, i, minIndex);
                i = minIndex;
            }
            return result;
        }

        public void update(Vertex next) {
            nodes[next.id] = next;
        }
    }
}

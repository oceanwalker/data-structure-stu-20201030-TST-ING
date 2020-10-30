package test.cn.oceanwalker.data_structure.geektime.learn.LearnGraph;

import cn.oceanwalker.data_structure.geektime.learn.learnGraph.Graph;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class TestTraverseGraph {
    @Test
    public void testTraverseGraphSimple() {
        int size = 5;
        Graph graph = new Graph(size);
        graph.addElement(0, 1);
        graph.addElement(0, 2);
        graph.addElement(0, 3);
        graph.addElement(0, 4);

        set = new HashSet<>();
        list = new ArrayList<>();
        dfs(graph, 0, new boolean[size]);
        assertEquals(size, set.size());
        assertEquals(size, list.size());
        set = new HashSet<>();
        list = new ArrayList<>();
        bfs(graph, 0, new boolean[size], new LinkedList<>());
        assertEquals(size, set.size());
        assertEquals(size, list.size());
    }

    private void bfs(Graph graph, int start, boolean[] visited, LinkedList<Integer> queue) {
        queue.offer(start);
        while (!queue.isEmpty()) {
            int point = queue.poll();
            if (visited[point]) {
                continue;
            }
            traverse(point);
            visited[point] = true;
            for (Integer index : graph.getList(point)) {
                queue.offer(index);
            }
        }
    }

    private void traverse(int point) {
        list.add(point);
        set.add(point);
        System.out.println(point);
    }

    @Test
    public void testTraverseGraphPuzzle() {
        int size = 11;
        Graph graph = new Graph(size);
        graph.addElement(0, 1);
        graph.addElement(0, 2);
        graph.addElement(0, 3);
        graph.addElement(0, 4);
        graph.addElement(1, 4);
        graph.addElement(1, 7);
        graph.addElement(1, 9);
        graph.addElement(7, 8);
        graph.addElement(7, 10);
        graph.addElement(4, 5);
        graph.addElement(3, 5);
        graph.addElement(3, 6);
        System.out.println(graph);

        set = new HashSet<>();
        list = new ArrayList<>();
        dfs(graph, 0, new boolean[size]);
        assertEquals(size, set.size());
        assertEquals(size, list.size());

        set = new HashSet<>();
        list = new ArrayList<>();
        bfs(graph, 0, new boolean[size], new LinkedList<>());
        assertEquals(size, set.size());
        assertEquals(size, list.size());
    }

    HashSet<Integer> set;
    ArrayList<Integer> list;

    private void dfs(Graph graph, int start, boolean[] visited) {
        traverse(start);
        visited[start] = true;

        for (Integer point : graph.getList(start)) {
            if (!visited[point]) {
                dfs(graph, point, visited);
            }
        }
        return;
    }
}

package cn.oceanwalker.data_structure.geektime.learn.learnGraph;

import java.util.*;

public class Graph {
    private final int size;
    private final Vertex[] vertexs;
    private LinkedList<Integer>[] adj;
    public Graph(int size) {
        this.size=size;
        vertexs=new Vertex[size];
        adj=new LinkedList[size];
        for (int i = 0; i < size; i++) {
            vertexs[i]=new Vertex(i);
            adj[i]=new LinkedList<>();
        }
    }

    public void addElement(int from, int to) {
        adj[from].add(to);
    }


    public int getData(int start) {
        return vertexs[start].getData();
    }

    public LinkedList<Integer> getList(int start) {
        return adj[start];
    }

    @Override
    public String toString() {
        return "Graph{" +
                "size=" + size +
                ", vertexs=" + Arrays.toString(vertexs) +
                ", adj=" + Arrays.toString(adj) +
                '}';
    }

    public String topoSortByKahn() {
        int[] inDegree=new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < adj[i].size(); j++) {
                inDegree[adj[i].get(j)]++;
            }
        }
        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if(inDegree[i]==0){
                queue.offer(i);
            }
        }
        StringBuilder result=new StringBuilder();
        while (!queue.isEmpty()){
            int v=queue.poll();
            result.append(v);
            for (int i = 0; i < adj[v].size(); i++) {
                final Integer k = adj[v].get(i);
                inDegree[k]--;
                if (inDegree[k] == 0) {
                    queue.offer(k);
                }
            }
        }
        return result.toString();
    }

    public String topoSortByDfs() {
        LinkedList<Integer>[] inverseAdj=new LinkedList[size];
        for (int i = 0; i < size; i++) {
            inverseAdj[i]=new LinkedList<>();
        }
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[i].size(); j++) {
                inverseAdj[adj[i].get(j)].add(i);
            }
        }
        boolean[] visited=new boolean[size];
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < size; i++) {
            if(visited[i]){
                continue;
            }
            topoDfs(i,inverseAdj,visited,result);
        }
        return result.toString();
    }

    private void topoDfs(int i, LinkedList<Integer>[] inverseAdj, boolean[] visited, StringBuilder result) {
        if(visited[i]){
            return;
        }
        visited[i]=true;
        for (int j = 0; j < inverseAdj[i].size(); j++) {
            topoDfs(inverseAdj[i].get(j),inverseAdj,visited,result);
        }
        result.append(i);
    }

    public boolean detectCircleByKahn() {
        int[] inDegree=new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < adj[i].size(); j++) {
                inDegree[adj[i].get(j)]++;
            }
        }
        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if(inDegree[i]==0){
                queue.offer(i);
            }
        }
        StringBuilder result=new StringBuilder();
        List<Integer> list=new ArrayList<>();
        while (!queue.isEmpty()){
            int v=queue.poll();
            list.add(v);
            for (int i = 0; i < adj[v].size(); i++) {
                final Integer k = adj[v].get(i);
                inDegree[k]--;
                if (inDegree[k] == 0) {
                    queue.offer(k);
                }
            }
        }
        return list.size()!=size;
    }
}

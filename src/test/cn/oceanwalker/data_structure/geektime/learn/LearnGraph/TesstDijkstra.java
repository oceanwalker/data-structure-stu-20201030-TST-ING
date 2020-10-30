package test.cn.oceanwalker.data_structure.geektime.learn.LearnGraph;

import cn.oceanwalker.data_structure.geektime.learn.learnGraph.GraphWithWeight;
import org.junit.Test;

public class TesstDijkstra {
    @Test
    public void test(){
        int size=6;
        GraphWithWeight graph= new GraphWithWeight(size);
        graph.addEdge(0,1,10);
        graph.addEdge(1,2,15);
        graph.addEdge(1,3,2);
        graph.addEdge(2,5,5);
        graph.addEdge(3,5,12);
        graph.addEdge(3,2,1);
        graph.addEdge(0,4,15);
        graph.addEdge(4,5,10);


//        assertEquals("52310",graph.dijkstra(0,5));
    }
}

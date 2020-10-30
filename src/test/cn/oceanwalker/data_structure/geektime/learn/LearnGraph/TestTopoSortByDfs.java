package test.cn.oceanwalker.data_structure.geektime.learn.LearnGraph;

import cn.oceanwalker.data_structure.geektime.learn.learnGraph.Graph;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTopoSortByDfs {
    @Test
    public void test(){
        Graph graph=new Graph(4);
        graph.addElement(3,2);
        graph.addElement(3,1);
        graph.addElement(2,1);
        graph.addElement(2,0);
        graph.addElement(1,0);
        assertEquals("3210",graph.topoSortByDfs());
    }
}

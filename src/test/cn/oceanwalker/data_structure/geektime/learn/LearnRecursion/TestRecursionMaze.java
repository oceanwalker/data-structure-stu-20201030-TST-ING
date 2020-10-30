package test.cn.oceanwalker.data_structure.geektime.learn.LearnRecursion;

import cn.oceanwalker.data_structure.geektime.learn.LearnRecursion.MazeRecursionDecoder;
import cn.oceanwalker.data_structure.geektime.learn.learnStack.Maze;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class TestRecursionMaze {
    @Test
    public void testMaze() throws FileNotFoundException {
        String fileName = "2x2.txt";
        fileName = "testfile.txt";
        fileName = "testfile3.txt";
        Maze maze = new Maze(fileName);
        MazeRecursionDecoder decoder = new MazeRecursionDecoder(maze);
        assertEquals(true,decoder.decode(0,0));
        System.out.println(maze);
    }
}

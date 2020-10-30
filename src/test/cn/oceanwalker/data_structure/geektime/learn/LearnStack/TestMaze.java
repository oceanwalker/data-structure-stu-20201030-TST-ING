package test.cn.oceanwalker.data_structure.geektime.learn.LearnStack;

import cn.oceanwalker.data_structure.geektime.learn.learnStack.Maze;
import cn.oceanwalker.data_structure.geektime.learn.learnStack.MazeDecoder;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class TestMaze {
    @Test
    public void testReadTxt() throws FileNotFoundException {
//        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file containing the maze: ");
//        String filename = scanner.nextLine();
        Scanner scanner = new Scanner(new File("2x2.txt"));
        assertEquals(2, scanner.nextInt());
        assertEquals(2, scanner.nextInt());
    }

    @Test
    public void testBuildMaze() throws FileNotFoundException {
        String fileName = "2x2.txt";
        Maze maze = new Maze(fileName);
        assertEquals(2, maze.getWidth());
        assertEquals(2, maze.getHeight());
        assertEquals(2, maze.getMaze().length);
        assertEquals(2, maze.getMaze()[0].length);
    }

    @Test
    public void testJudgeAvaliable() throws FileNotFoundException {
        String fileName = "2x2.txt";
        Maze maze = new Maze(fileName);
        assertEquals(true,maze.isAvaliable(0,0));
        assertEquals(true,maze.isAvaliable(0,1));
        assertEquals(false,maze.isAvaliable(-1,0));
        assertEquals(false,maze.isAvaliable(1,2));
    }
    @Test
    public void testMark() throws FileNotFoundException {
        String fileName = "2x2.txt";
        Maze maze = new Maze(fileName);
        int x=0;
        int y=0;
        assertEquals(1,maze.getMaze()[x][y]);
        maze.tryPosition(x,y);
        assertEquals(2,maze.getMaze()[x][y]);
    }

    @Test
    public void testDecode2x2() throws FileNotFoundException {
        Maze maze = new Maze("2x2.txt");
        MazeDecoder decoder=new MazeDecoder(maze);
        assertEquals(true,decoder.getMaze()!=null);
        assertEquals(true,decoder.decode());
    }
    @Test
    public void testDecode2x2fail() throws FileNotFoundException {
        Maze maze = new Maze("2x2f.txt");
        MazeDecoder decoder=new MazeDecoder(maze);
        assertEquals(true,decoder.getMaze()!=null);
        assertEquals(false,decoder.decode());
    }
    @Test
    public void testAll() throws FileNotFoundException {
        System.out.println("迷宫说明：数字0代表墙，1代表路。");
            boolean[] result=new boolean[]{true,false,true,true};
        for (int i = 0; i <4; i++) {
            String fileName="testfile"+(i==0?"":i+1)+".txt";
            Maze maze=new Maze(fileName);
            System.out.println("原始迷宫：");
            System.out.println(maze);
            MazeDecoder decoder=new MazeDecoder(maze);
            assertEquals(result[i],decoder.decode());
            System.out.println("解析后迷宫：");
            System.out.println(maze);
            System.out.println("----------------------------------------------------------------------------");
        }
    }
}

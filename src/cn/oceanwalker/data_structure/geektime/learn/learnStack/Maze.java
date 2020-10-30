package cn.oceanwalker.data_structure.geektime.learn.learnStack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze {
    private final String fileName;

    public String getFileName() {
        return fileName;
    }

    public Maze(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        Scanner scanner = new Scanner(new File(fileName));
        height = scanner.nextInt();
        width = scanner.nextInt();
        maze = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                try {
                    maze[i][j] = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("i:" + i + " j:" + j);
                    e.printStackTrace();
                }
            }
        }
    }

    int width;

    public int getWidth() {
        return width;
    }

    int height;

    public int getHeight() {
        return height;
    }

    int[][] maze;

    public int[][] getMaze() {
        return maze;
    }

    public boolean isAvaliable(int x, int y) {
        if (x < 0 || x > width - 1 || y < 0 || y > height - 1) {
            return false;
        }
        return maze[y][x] == 1;
    }

    final int TRIED = 2;
    final int PATH = 4;

    public void tryPosition(int x, int y) {
        maze[y][x] = TRIED;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (int[] rows : maze) {
            for (int element : rows) {
                sb.append(element).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean isEndPoint(int x, int y) {
        return x == width - 1 && y == height - 1;
    }

    public void mark(int x, int y) {
        maze[y][x] = PATH;
    }
}

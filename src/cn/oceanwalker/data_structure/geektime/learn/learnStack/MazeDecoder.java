package cn.oceanwalker.data_structure.geektime.learn.learnStack;


import java.util.Deque;
import java.util.LinkedList;

public class MazeDecoder {
    private Maze maze;

    public MazeDecoder(Maze maze) {
        this.maze = maze;
    }

    public Maze getMaze() {
        return maze;
    }

    Deque<Position> stack;

    public boolean decode() {
        boolean result = false;
        Position position = new Position();
        stack = new LinkedList<>();
        stack.push(position);
        while (!result && stack.size() != 0) {
            position = stack.pop();
            maze.tryPosition(position.x, position.y);
            if (position.x == maze.getWidth() - 1 &&
                    position.y == maze.getHeight() - 1) {
                result = true;
            } else {
                addPosition(position.x, position.y - 1);
                addPosition(position.x + 1, position.y);
                addPosition(position.x, position.y + 1);
                addPosition(position.x - 1, position.y);
            }
        }
        System.out.println("是否有出路: "+(result?"有":"没有"));
        return result;
    }

    private void addPosition(int x, int y) {
        if (maze.isAvaliable(x, y)) {
            stack.push(new Position(x, y));
        }
    }

    private class Position {
        int x = 0;
        int y = 0;

        public Position() {
        }

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

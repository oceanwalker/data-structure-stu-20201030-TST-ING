package cn.oceanwalker.data_structure.geektime.learn.LearnRecursion;

import cn.oceanwalker.data_structure.geektime.learn.learnStack.Maze;

public class MazeRecursionDecoder {
    private Maze maze;

    public MazeRecursionDecoder(Maze maze) {
        this.maze = maze;
    }

    public boolean decode(int x, int y) {
        boolean done = false;
        if (maze.isAvaliable(x, y)) {//当前处理
            maze.tryPosition(x,y);  //当前处理
            if (maze.isEndPoint(x, y)) {//终止条件
                done = true;
            } else {//递归调用
                
                done = decode(x, y + 1);
                if (!done)
                    done = decode(x, y - 1);
                if (!done)
                    done = decode(x - 1, y);
                if (!done)
                    done = decode(x + 1, y);
            }
            if(done)
                maze.mark(x,y);
        }
        return done;
    }
}

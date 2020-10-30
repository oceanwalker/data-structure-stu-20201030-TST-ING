package cn.oceanwalker.data_structure.geektime.learn.LearnRecursion;

public class MinDist {
    public static int minDist(int i, int j, int[][] m, int[][] mem, int n) {
        if (i == 0 && j == 0) {
            return m[0][0];
        }
        if (mem[i][j] > 0) {
            return mem[i][j];
        }
        int minL = Integer.MAX_VALUE;
        int minU = Integer.MAX_VALUE;
        if (j > 0) {
            minL = minDist(i, j - 1, m, mem, n);
        }
        if (i > 0) {
            minU = minDist(i - 1, j, m, mem, n);
        }
        mem[i][j] = m[i][j] + Math.min(minL, minU);
        return mem[i][j];
    }
}

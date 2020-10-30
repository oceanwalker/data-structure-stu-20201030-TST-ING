package cn.oceanwalker.data_structure.geektime.learn.LearnBackTracking;

public class MinDist {
    private int minV = Integer.MAX_VALUE;

    public int getMinV() {
        return minV;
    }

    public int minDist(int i, int j, int v, int[][] m, int n) {
        if (i == n - 1 && j == n - 1) {
            if (v < minV) {
                minV = v;
            }
            return 0;
        }
        if (i < n - 1) {
            minDist(i + 1, j, m[i + 1][j] + v, m, n);
        }
        if (j < n - 1) {
            minDist(i, j + 1, m[i][j + 1] + v, m, n);
        }
        return minV;
    }
}

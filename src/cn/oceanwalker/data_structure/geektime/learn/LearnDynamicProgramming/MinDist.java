package cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

public class MinDist {
    public static int run(int[][] m, int n) {
        int status[][] = new int[n][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += m[i][0];
            status[i][0] = sum;
        }
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += m[0][i];
            status[0][i] = sum;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                status[i][j] = m[i][j] + Math.min(status[i - 1][j], status[i][j - 1]);
            }
        }
        return status[n - 1][n - 1];
    }
}

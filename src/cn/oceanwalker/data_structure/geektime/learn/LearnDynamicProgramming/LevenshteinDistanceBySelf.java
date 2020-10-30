package cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

public class LevenshteinDistanceBySelf {
    public static int lwstDP(char[] a, int m, char[] b, int n) {
        int[][] status = new int[m][n];
        for (int i = 0; i < n; i++) {
            if (a[0] == b[i]) {
                status[0][i] = i;
            } else if (i == 0) {
                status[0][i] = 0;
            } else {
                status[0][i] = status[0][i - 1] + 1;
            }
        }
        for (int i = 0; i < m; i++) {
            if (b[0] == a[i]) {
                status[i][0] = i;
            } else if (i == 0) {
                status[i][0] = 0;
            } else {
                status[i][0] = status[i - 1][0] + 1;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (a[i] == b[j]) {
                    status[i][j] = min(status[i - 1][j] + 1, status[i][j - 1] + 1, status[i - 1][j - 1]);
                } else {
                    status[i][j] = min(status[i - 1][j] + 1, status[i][j - 1] + 1, status[i - 1][j - 1] + 1);
                }
            }
        }
        return status[m - 1][n - 1];
    }

    private static int min(int x, int y, int z) {
        int result = Integer.MAX_VALUE;
        if (x < result) {
            result = x;
        }
        if (y < result) {
            result = y;
        }
        if (z < result) {
            result = z;
        }
        return result;
    }
}

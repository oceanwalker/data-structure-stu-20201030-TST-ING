package cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

public class LevenshteinDistanceFail {
    public static int minEdit(char[] a, char[] b) {
        int m = a.length;
        int n = b.length;
        int[][] status = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                status[i][j] = -1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == m - 1 || j == n - 1) {
                    if (j < n - 1) {
                        status[m - 1][n - 1] = judge(status[m - 1][n - 1], status[i][j] + n - 1 - j);
                    }
                    if (i < m - 1) {
                        status[m - 1][n - 1] = judge(status[m - 1][n - 1], status[i][j] + m - 1 - j);
                    }
                }
                if (a[i] == b[j]) {
                    if (i < m - 1 && j < n - 1) {
                        status[i + 1][j + 1] = judge(status[i + 1][j + 1], status[i][j]);
                    }
                } else {
                    if (i < m - 1) {
                        status[i + 1][j] = judge(status[i + 1][j], status[i][j] + 1);
                    }
                    if (j < n - 1) {
                        status[i][j + 1] = judge(status[i][j + 1], status[i][j] + 1);
                    }
                    if (i < m - 1 && j < n - 1) {
                        status[i + 1][j + 1] = judge(status[i + 1][j + 1], status[i][j] + 1);
                    }
                }
            }
        }
        return status[m - 1][n - 1];
    }

    private static int judge(int status, int status1) {
        if (status == -1) {
            return status1;
        } else {
            return status > status1 ? status1 : status;
        }
    }
}

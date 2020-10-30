package cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

public class SelectCoin {
    public static int select(int[] v, int w) {
        if (v.length == 0 || w <= 0) return -1;
        int n = w / v[0];
        boolean[][] status = new boolean[n + 1][w + 1];
        status[0][0] = true;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                if (status[i - 1][j]) {
                    for (int k = 0; k < v.length; k++) {
                        if (j + v[k] <= w) {
                            status[i][j + v[k]] = true;
                            if (w == j + v[k]) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (status[i][w]) {
                return i;
            }
        }
        return -1;
    }
}

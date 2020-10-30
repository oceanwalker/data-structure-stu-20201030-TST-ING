package cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

public class BagOptimizeDynamic {
    public static int run(int n, int w, int[] items, int[] values) {
        int[][] status = new int[n][w + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < w + 1; j++) {
                status[i][j] = -1;
            }
        }
        status[0][0] = 0;
        if (items[0] < w) {
            status[0][items[0]] = values[0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < w; j++) {
                if (status[i - 1][j] >= 0) {
                    status[i][j] = status[i - 1][j];
                }
            }
            for (int j = 0; j <= w - items[i]; j++) {
                if (status[i][j] >= 0) {
                    int temp = status[i][j] + values[i];
                    if (temp > status[i][j + items[i]]) {
                        status[i][j + items[i]] = temp;
                    }
                }
            }
        }
        int max = 0;
        for (int i = 0; i <= w; i++) {
            if (status[n - 1][i] > max) {
                max = status[n - 1][i];
            }
        }
        return max;
    }

    public static int knapsack3( int n, int w,int[] weight, int[] value) {
        int[][] states = new int[n][w+1];
        for (int i = 0; i < n; ++i) { // 初始化states
            for (int j = 0; j < w+1; ++j) {
                states[i][j] = -1;
            }
        }
        states[0][0] = 0;
        if (weight[0] <= w) {
            states[0][weight[0]] = value[0];
        }
        for (int i = 1; i < n; ++i) { //动态规划，状态转移
            for (int j = 0; j <= w; ++j) { // 不选择第i个物品
                if (states[i-1][j] >= 0) states[i][j] = states[i-1][j];
            }
            for (int j = 0; j <= w-weight[i]; ++j) { // 选择第i个物品
                if (states[i-1][j] >= 0) {
                    int v = states[i-1][j] + value[i];
                    if (v > states[i][j+weight[i]]) {
                        states[i][j+weight[i]] = v;
                    }
                }
            }
        }
        // 找出最大值
        int maxvalue = -1;
        for (int j = 0; j <= w; ++j) {
            if (states[n-1][j] > maxvalue) maxvalue = states[n-1][j];
        }
        return maxvalue;
    }
}

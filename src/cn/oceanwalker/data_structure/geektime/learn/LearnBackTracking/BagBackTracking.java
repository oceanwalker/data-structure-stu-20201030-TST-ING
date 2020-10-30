package cn.oceanwalker.data_structure.geektime.learn.LearnBackTracking;

public class BagBackTracking {
    public static int maxW = Integer.MIN_VALUE;
    public static boolean[][] mark = new boolean[][]{};

    public static void init(int n, int w) {
        mark = new boolean[n][w];
    }

    public static void f(int i, int cw, int[] items, int n, int w) {
        if (cw == w || i == n) {
            if (cw > maxW) {
                maxW = cw;
            }
            return;
        }
        if (mark[i][cw]) {
            return;
        }
        mark[i][cw] = true;
        f(i + 1, cw, items, n, w);
        if (cw + items[i] <= w) {
            f(i + 1, cw + items[i], items, n, w);
        }
    }
}

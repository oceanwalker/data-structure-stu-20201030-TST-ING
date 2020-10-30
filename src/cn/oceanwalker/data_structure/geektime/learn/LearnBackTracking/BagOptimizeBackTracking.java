package cn.oceanwalker.data_structure.geektime.learn.LearnBackTracking;

public class BagOptimizeBackTracking {
    public static int maxValue;
    private static boolean[][] mark;
    private static int[][] valueMark;
    private static int times;

    public static void run(int i, int cw, int cv, int[] items, int[] values, int n, int w) {
        init(n, w);
        f(0, 0, 0, items, values, n, w);
        System.out.println("times=" + times);
    }

    private static void init(int n, int w) {
        maxValue = Integer.MIN_VALUE;
        times = 0;
        mark = new boolean[n][w + 1];
        valueMark = new int[n][w + 1];
    }

    public static void runOptimizeArray(int i, int i1, int i2, int[] items, int[] values, int n, int w) {
        init(n, w);
        f1(0, 0, 0, items, values, n, w);
        System.out.println("times=" + times);

    }

    public static void runOptimizeArrayAndValue(int i, int i1, int i2, int[] items, int[] values, int n, int w) {
        init(n, w);
        f2(0, 0, 0, items, values, n, w);
        System.out.println("times=" + times);
    }

    public static void f(int i, int cw, int cv, int[] items, int[] values, int n, int w) {
//        System.out.println("f");
        if (i == n || cw == w) {
            if (cv > maxValue) {
                maxValue = cv;
            }
            return;
        }
        f(i + 1, cw, cv, items, values, n, w);
        if (cw + items[i] <= w) {
            f(i + 1, cw + items[i], cv + values[i], items, values, n, w);
        }
        times++;
    }

    public static void f1(int i, int cw, int cv, int[] items, int[] values, int n, int w) {
//        System.out.println("f1");
        if (i == n || cw == w) {
            if (cv > maxValue) {
                maxValue = cv;
            }
            return;
        }
        if (mark[i][cw]) {
//            System.out.println("lets return");
            return;
        }
        mark[i][cw] = true;
        f1(i + 1, cw, cv, items, values, n, w);
        if (cw + items[i] <= w) {
            f1(i + 1, cw + items[i], cv + values[i], items, values, n, w);
        }
        times++;
    }

    public static void f2(int i, int cw, int cv, int[] items, int[] values, int n, int w) {
//        System.out.println("f2");
        if (i == n || cw == w) {
            if (cv > maxValue) {
                maxValue = cv;
            }
            return;
        }
        if (cv < valueMark[i][cw] && mark[i][cw]) {
//            System.out.println("lets return");
            return;
        }
        valueMark[i][cw] = cv;
        mark[i][cw] = true;
        f2(i + 1, cw, cv, items, values, n, w);
        if (cw + items[i] <= w) {
            f2(i + 1, cw + items[i], cv + values[i], items, values, n, w);
        }
        times++;
    }

}

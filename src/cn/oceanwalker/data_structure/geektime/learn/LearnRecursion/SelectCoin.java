package cn.oceanwalker.data_structure.geektime.learn.LearnRecursion;

public class SelectCoin {
    public static int select(int w, int[] v, int[] mem) {
        for (int i : v) {
            if (i == w) return 1;
        }
        if (mem[w] > 0) {
            return mem[w];
        }
        int min = Integer.MAX_VALUE;
        for (int i : v) {
            if (w - i >= 1) {
                int temp = select(w - i, v, mem) + 1;
                if (temp < min) {
                    min = temp;
                }
            }
        }

        mem[w] = min;
        return min;
    }
}

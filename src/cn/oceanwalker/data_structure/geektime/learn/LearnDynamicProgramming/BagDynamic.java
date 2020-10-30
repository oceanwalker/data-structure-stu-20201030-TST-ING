package cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

public class BagDynamic {
    public static String run(int maxW, int[] weights) {
        int n = weights.length;
        boolean[] status = new boolean[maxW+1];
        status[0] = true;
        if (weights[0] < maxW) {
            status[weights[0]] = true;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j <= maxW - weights[i - 1]; j++) {
                if (status[j]) {
                    status[j + weights[i - 1]] = true;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = maxW - 1; i >= 0; i--) {
            result.append(status[i] ? "1" : "0");
        }

        return result.toString();
    }
}

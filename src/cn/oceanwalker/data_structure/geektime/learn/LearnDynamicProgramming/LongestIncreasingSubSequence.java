package cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubSequence {
    public static int find(int[] a, int n, int[] status) {
        if(n<=1)return n;
        int result = 1;
        for (int i = 0; i < n; i++) {
            status[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] > a[j]) {
                    int temp = status[j] + 1;
                    if (temp > status[i]) {
                        status[i] = temp;
                    }
                    if (temp > result) {
                        result = temp;
                    }
                }
            }
            System.out.println("i="+i+" "+ Arrays.toString(status));
        }
        return result;
    }
}

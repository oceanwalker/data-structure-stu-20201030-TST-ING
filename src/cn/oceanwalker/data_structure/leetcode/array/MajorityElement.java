package cn.oceanwalker.data_structure.leetcode.array;

import java.util.Arrays;

public class MajorityElement {

    public static int find(int[] a) {
        Arrays.sort(a);
        return a[a.length / 2];
//        int result = a[0];
//        int last = a[0];
//        int n = a.length;
//        int times = 0;
//        for (int i = 1; i < n; i++) {
//            final int cur = a[i];
//            if (cur == last) {
//                times++;
//            } else {
//                times = 1;
//            }
//            last = cur;
//            if (times > n / 2) {
//                result = cur;
//                break;
//            }
//        }
//        return result;
    }
}

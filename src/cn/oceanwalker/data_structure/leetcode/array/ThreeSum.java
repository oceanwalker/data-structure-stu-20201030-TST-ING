package cn.oceanwalker.data_structure.leetcode.array;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> find20201013(int[] a) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(a);
        int n = a.length;
        for (int first = 0; first < n; first++) {
            if (a[first] > 0) break;
            if (first > 0 && a[first - 1] == a[first]) continue;
            int third = n - 1;
            for (int second = first + 1; second < n - 1; second++) {
                if (a[first] + a[second] > 0) break;
                if (second > first + 1 && a[second - 1] == a[second]) continue;
                while (third > second && a[first] + a[second] + a[third] > 0) {
                    third--;
                }
                if (third == second) {
                    break;
                }
                if (a[first] + a[second] + a[third] == 0) {
                    result.add(List.of(a[first], a[second], a[third]));
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> find(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        final int n = nums.length;
        for (int first = 0; first < n; first++) {
            if (nums[first] > 0) break;
            if (first > 0 && nums[first] == nums[first - 1]) continue;
            int third = n - 1;
            for (int second = first + 1; second < n; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) continue;
                while (second < third && nums[first] + nums[second] + nums[third] > 0) {
                    third--;
                }
                if (second == third) {
                    break;
                }
                if (nums[first] + nums[second] + nums[third] == 0) {
                    result.add(List.of(nums[first], nums[second], nums[third]));
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> myFind(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == nums || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        Set<List<Integer>> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            final int ii = nums[i];
            if (ii > 0) break;
            if (i > 0 && ii == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 1; j++) {
                final int jj = nums[j];
                if (jj + ii > 0) break;
                if (j > i + 1 && jj == nums[j - 1]) continue;
                for (int k = j + 1; k < nums.length; k++) {
                    final int kk = nums[k];
                    if (ii + jj + kk > 0) break;
                    if (k > j + 1 && kk == nums[k - 1]) continue;
                    if (ii + jj + kk < 0) {
                        continue;
                    }
                    set.add(List.of(ii, jj, kk));
                }
            }
        }
        result = new ArrayList<>(set);
        return result;
    }
}

package cn.oceanwalker.data_structure.leetcode.array;

import java.util.Arrays;

public class FirstMissingPositive {
    public static int myFind20201013(int[] a) {
        if (null == a || 0 == a.length)
            return 1;
        Arrays.sort(a);
        int result = 0;
        int last = a[0];
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            if (num <= 0 || (i > 0 && num == last)) continue;
            if (num != result + 1) {
                break;
            }
            result = num;
            last = num;
        }
        return result + 1;
    }

    public static int hashFind(int[] a) {
        final int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] <= 0) a[i] = n + 1;
        }
        for (int i = 0; i < a.length; i++) {
            final int index = Math.abs(a[i]);
            if (index <= n) {
                a[index - 1] = -Math.abs(a[index - 1]);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) return i + 1;
        }
        return n + 1;
    }

    public static int sortFind(int[] nums) {
        Arrays.sort(nums);
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > result) {
                break;
            } else if (nums[i] == result) {
                result++;
            }
        }
        return result;
    }

    public static int replaceFind(int[] nums) {
        final int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static int bitFind(int[] nums) {
        final int n = nums.length;
        int[] bit = new int[n - 1 / 32 + 1];
        for (int i = 0; i < n; i++) {
            final int index = nums[i];
            if (index >= 1 && index <= n) {
                bit[(index - 1) / 32] |= 1 << (index - 1) % 32;
            }
        }
        for (int i = 0; i < n; i++) {
            if ((bit[i / 32] & (1 << i % 32)) == 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}

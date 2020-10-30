package cn.oceanwalker.data_structure.geektime.learn.LearnForeachArray;

public class HelixArray2Index {

    public static String print(int[][] a) {
        StringBuilder result = new StringBuilder();
        if (a == null || a.length == 0 || a[0].length == 0) {
            return result.toString();
        }
        int m = a.length;
        int n = a[0].length;
        for (int i = 0; i < (Math.min(m, n) + 1) / 2; i++) {
            for (int j = i; j < n - i; j++) {
                result.append(a[i][j]);
            }
            for (int j = i + 1; j < m - i; j++) {
                result.append(a[j][n - 1 - i]);
            }
            for (int j = n - 2 - i; j >= i; j--) {
                result.append(a[m - 1 - i][j]);
            }
            for (int j = m - 2 - i; j > i; j--) {
                result.append(a[j][i]);
            }
        }
        return result.toString();
    }
}

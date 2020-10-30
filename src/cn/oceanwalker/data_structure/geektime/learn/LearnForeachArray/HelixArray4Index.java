package cn.oceanwalker.data_structure.geektime.learn.LearnForeachArray;

public class HelixArray4Index {
    public static String print(int[][] a) {
        if (a == null || a.length == 0 || a[0].length == 0) {
            return "";
        }
        int m = a.length;
        int n = a[0].length;
        int i = 0;
        int j = n - 1;
        int k = 0;
        int l = m - 1;
        StringBuilder result = new StringBuilder();
        while ((i < j || k < l) || (i == j && k == l)) {
            for (int o = i; o <= j; o++) {
                result.append(a[k][o]);
            }
            k++;
            for (int o = k; o <= l; o++) {
                result.append(a[o][j]);
            }
            j--;
            for (int o = j; o >= i; o--) {
                result.append(a[l][o]);
            }
            l--;
            for (int o = l; o >= k; o--) {
                result.append(a[o][i]);
            }
            i++;
        }
        return result.toString();
    }
}

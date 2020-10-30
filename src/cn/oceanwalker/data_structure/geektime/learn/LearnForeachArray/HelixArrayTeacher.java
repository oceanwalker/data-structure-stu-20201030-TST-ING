package cn.oceanwalker.data_structure.geektime.learn.LearnForeachArray;

public class HelixArrayTeacher {

    public static String print(int[][] matrix) {
        StringBuilder result = new StringBuilder();
        //当二维数组是空或任何一个维度是0，直接返回
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result.toString();
        }
        //m是矩阵的行数
        int m = matrix.length;
        //n是矩阵的列数
        int n = matrix[0].length;
        //大循环，从外向内逐层遍历矩阵
        for (int i = 0; i < (Math.min(m, n) + 1) / 2; i++) {
            //从左到右遍历“上边”
            for (int j = i; j < n - i; j++) {
                result.append(matrix[i][j]);
            }
            //从上到下遍历“右边”
            for (int j = i + 1; j < m - i; j++) {
                result.append(matrix[j][(n - 1) - i]);
            }
            //从右到左遍历“下边”
            for (int j = i + 1; j < n - i; j++) {
                result.append(matrix[(m - 1) - i][(n - 1) - j]);
            }
            //从下到上遍历“左边”
            for (int j = i + 1; j < m - 1 - i; j++) {
                result.append(matrix[(m - 1) - j][i]);
            }
        }
        return result.toString();
    }
}

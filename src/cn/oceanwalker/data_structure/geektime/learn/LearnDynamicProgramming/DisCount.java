package cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

import java.util.Stack;

public class DisCount {
    public static int buy(int[] prices, int n, int p) {
        for (int i = 0; i < prices.length; i++) {
            System.out.print("第 " + (i+1) + " 个 " + prices[i] + " 元，");
        }
        System.out.println();
        final int pCount = p * 3 + 1;
        boolean[][] status = new boolean[n][pCount];
        status[0][0] = true;
        if (prices[0] < pCount) {
            status[0][prices[0]] = true;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < pCount - prices[i]; j++) {
                if (status[i - 1][j]) {
                    status[i][j] = true;
                }
                if (status[i - 1][j]) {
                    status[i][j + prices[i]] = true;
                }
            }
        }
        int j = 200;
        while (j < pCount && !status[n - 1][j]) {
            j++;
        }
        int pc = j;
        for (int c = 100; c <= 300; c++) {
            j = c;
            if (!status[n - 1][j]) {
                System.out.println("----  ****");
                continue;
            }
            StringBuilder result = new StringBuilder();
            Stack<String> stack= new Stack<String>();
            if (j != pCount) {
                for (int i = n - 1; i > 0; i--) {
                    if (j - prices[i] >= 0 && status[i - 1][j - prices[i]]) {
                        stack.push(new StringBuilder().append("第 ").append(i+1).append(" 个 ").append(prices[i]).append(" 元").toString());
                        j -= prices[i];
                    }
                }
            }
            if (j != 0) {
                stack.push("第 1 个 " + prices[0] + " 元");
            }
            while (!stack.isEmpty()){
                result.append(stack.pop()).append(" + ");
            }
                result = result.delete(result.length() - 2, result.length()).append("。");
            System.out.println("总金额：" + c + " 元搭配方案：" + result.toString());
        }
//        for (int i = 0; i < 600; i++) {
//            System.out.print(status[n - 1][i] ? "1" : "0");
//            System.out.print(i == 200 ? "\n 200\n " : "");
//            System.out.print(i == 300 ? "\n 300\n" : "");
//            System.out.print(i == 400 ? "\n 400\n" : "");
//            System.out.print(i == 500 ? "\n 500\n" : "");
//        }
        return pc;
    }

    public static boolean testRange(int min, int max, int[] prices) {
        final int n = prices.length;
        final int pCount = max + 1;
        boolean[][] status = new boolean[n][pCount];
        status[0][0] = true;
        if (prices[0] < pCount) {
            status[0][prices[0]] = true;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < pCount; j++) {
                if (status[i - 1][j]) {
                    status[i][j] = true;
                }
                if (status[i - 1][j] && j + prices[i] < pCount) {
                    status[i][j + prices[i]] = true;
                }
            }
        }
        for (int j = min + 1; j <= max; j++) {
            if (!status[n - 1][j]) {
//                System.out.println("fail " + j);
                return false;
            }
        }
        return true;
    }
}

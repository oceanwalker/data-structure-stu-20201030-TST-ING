package test.cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

public class DynamicProgramOrder {
    // j 从大到小循环
    public static int knapsack2(int[] items, int n, int w) {
        boolean[] states = new boolean[w+1]; // 默认值false
        states[0] = true; // 第一行的数据要特殊处理，可以利用哨兵优化
        if (items[0] <= w) {
            states[items[0]] = true;
        }
        for (int i = 1; i < n; ++i) { // 动态规划
            for (int j = w-items[i]; j >= 0; --j) {//把第i个物品放入背包
                if (states[j]==true) states[j+items[i]] = true;
            }
        }
        for (int i = w; i >= 0; --i) { // 输出结果
            if (states[i] == true) return i;
        }
        return 0;
    }

    // j 从小到大循环
    public static int knapsack1(int[] items, int n, int w) {
        boolean[] states = new boolean[w+1]; // 默认值false
        states[0] = true; // 第一行的数据要特殊处理，可以利用哨兵优化
        if (items[0] <= w) {
            states[items[0]] = true;
        }
        for (int i = 1; i < n; ++i) { // 动态规划
            for (int j = 0; j <= w-items[i]; j++) {//把第i个物品放入背包
                if (states[j]==true) states[j+items[i]] = true;
            }
        }
        for (int i = w; i >= 0; --i) { // 输出结果
            if (states[i] == true) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        DynamicProgramOrder dpo = new DynamicProgramOrder();
        int[] a = {1,31,2};
        System.out.println("j 从大到小"+dpo.knapsack2(a,3,76));
        System.out.println("==========================");
        System.out.println("j 从小到大" + dpo.knapsack1(a,3,76));
    }

}

package cn.oceanwalker.data_structure.geektime.learn.learnGreedy;

public class MyRemoveNumber {
    public static int remove(Integer target, int removeCount) {
        int len=target.toString().length();
        double[] weighting = new double[len];
        int[] pos = new int[len];
        for (int i = 0; i < len; i++) {
            weighting[i] = Integer.parseInt(target.toString().charAt(i) + "") * ((len - i) * 0.1 + 1);
            pos[i] = i;
        }
        System.out.println(target);
        bubbleSort(weighting, pos);
        int[] skip = new int[removeCount];
        for (int i = len-1; i >= len-removeCount; i--) {
            skip[len-i-1] = pos[i];
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < target.toString().length(); i++) {
            boolean isSkip = false;
            for (int sn : skip) {
                if (i == sn) {
                    isSkip = true;
                }
            }
            if (isSkip) {
                continue;
            }
            builder.append(target.toString().charAt(i));
        }
        int result=Integer.parseInt(builder.toString());
        System.out.println(result);
        System.out.println();
        return result;
    }


    public static void bubbleSort(double[] arr, int[] pos) {
        if (arr == null)
            return;
        int len = arr.length;
        //i控制循环次数，长度为len的数组只需要循环len-1次，i的起始值为0所以i<len-1
        for (int i = 0; i < len - 1; i++) {
            //j控制比较次数，第i次循环内需要比较len-i次
            //但是由于是由arr[j]跟arr[j+1]进行比较，所以为了保证arr[j+1]不越界，j<len-i-1
            for (int j = 0; j < len - i - 1; j++) {
                //如果前一个数比后一个数大，则交换位置将大的数往后放。
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    int temp1 = pos[j + 1];
                    pos[j + 1] = pos[j];
                    pos[j] = temp1;
                }
            }
        }
    }

}

package cn.oceanwalker.data_structure.geektime.learn.LearnSort;

public class ShellSort {
    public static void sort(int[] a) {
        int length=a.length;
        for(int step=length/2;step>=1;step=step/2){
            for (int i = step; i < length; i++) {
                int temp=a[i];
                int j=i-step;
                while (j>=0&&a[j]>temp){
                    a[j+step]=a[j];
                    j-=step;
                }
                a[j+step]=temp;
//                int j=i;
//                for (;j>=step;j-=step){
//                    if(a[j-step]>temp){
//                        a[j]=a[j-step];
//                    }else{
//                        break;
//                    }
//                }
//                a[j]=temp;
            }
        }
    }
}

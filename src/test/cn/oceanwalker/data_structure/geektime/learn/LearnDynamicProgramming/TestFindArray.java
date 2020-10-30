package test.cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

import cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming.DisCount;
import org.junit.Test;

import java.util.ArrayList;

public class TestFindArray {
    int n = 9;
    int min = 100;
    int max = 300;

    @Test
    public void testStr() {

    }

    @Test
    public void test() {
        ArrayList<int[]> list;
        int[] a;
        int index = 0;
        for (int t = 3; t < n; t++) {
            a = new int[t+1];
            list = new ArrayList<>(100000000);
            for (int i = 0; i < max; i++) {
                a[0] = i;
                if (t == 0) {
                    list.add(a);
                    continue;
                }
                for (int j = 0; j < max; j++) {
                    a[1] = j;
                    if (t == 1) {
                        list.add(a);
                        continue;
                    }
                    for (int k = 0; k < max; k++) {
                        a[2] = k;
                        if (t == 2) {
                            list.add(a);
                            continue;
                        }
                        for (int l = 0; l < max; l++) {
                            a[3] = l;
                            if (t == 3) {
                                list.add(a);
                                continue;
                            }
                            for (int m = 0; m < max; m++) {
                                a[4] = m;
                                if (t == 4) {
                                    list.add(a);
                                    continue;
                                }
                                for (int o = 0; o < max; o++) {
                                    a[5] = o;
                                    if (t == 5) {
                                        list.add(a);
                                        continue;
                                    }
                                    for (int p = 0; p < max; p++) {
                                        a[6] = p;
                                        if (t == 6) {
                                            list.add(a);
                                            continue;
                                        }
                                        for (int q = 0; q < max; q++) {
                                            a[7] = q;
                                            if (t == 7) {
                                                list.add(a);
                                                continue;
                                            }
                                            for (int r = 0; r < max; r++) {
                                                a[8] = r;
                                                if (t == 8) {
                                                    list.add(a);
                                                    continue;
                                                }
                                                if (judge(a)) {
                                                    continue;
                                                }
                                                list.add(a);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("over:"+t+" size:"+list.size());
            if(testList(list)){
                System.out.println("success"+t);
                break;
            }
            System.out.println("over test");
        }
//        assertEquals(300^9,list.size());
    }

    private boolean testList(ArrayList<int[]> list) {
        for (int[] prices : list) {
            if(DisCount.testRange(min,max,prices)){
                return true;
            }
        }
        return false;
    }

    private boolean judge(int[] a) {
        boolean isLargeMin = true;
        for (int i : a) {
            if (i < min) {
                isLargeMin = false;
            }
        }
        return isLargeMin;
    }
}

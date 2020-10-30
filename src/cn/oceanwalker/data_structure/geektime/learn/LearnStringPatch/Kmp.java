package cn.oceanwalker.data_structure.geektime.learn.LearnStringPatch;

public class Kmp {

    public static int index(String s, String t, int pos) {
        int result = -1;
        int i = 0;
        int j = 0;
        final int sl = s.length();
        final int tl = t.length();
        int[] next = getNext(t);

        while (i < sl && j < tl) {
            if (j == -1 || s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == tl) {
            return i - j;
        }
        return result;

    }

    private static int[] getNext(String t) {
        final int tl = t.length();
        int[] result = new int[tl];
        result[0] = -1;
        int i = 0;
        int j = -1;
        while (i < (tl - 1)) {
            if (j == -1 || t.charAt(i) == t.charAt(j)) {
                i++;
                j++;
                result[i] = j;
            } else {
                j = result[j];
            }
        }
        return result;
    }
}

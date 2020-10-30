package cn.oceanwalker.data_structure.geektime.learn.LearnStringPatch;

public class BruteForce {
    public static int index(String s, String t, int pos) {
        int result = -1;
        final int tl = t.length();
        final int sl = s.length();
        if (tl > sl) {
            return result;
        }
        int i = pos;
        int j = 0;
        while (i < sl && j < tl) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == tl) {
            result = i - tl;
        }
        return result;
    }
}

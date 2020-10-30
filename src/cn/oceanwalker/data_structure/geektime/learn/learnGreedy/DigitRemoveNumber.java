package cn.oceanwalker.data_structure.geektime.learn.learnGreedy;

public class DigitRemoveNumber {
    public static String  remove(String value, int count) {
        String str = value;

        int len = 0;
        int i = 0;
        int j = 0;
        for (int i1 = 0; i1 < count; i1++) {
            i = 0;
            len = str.length();
            while (i < len - 1) {
                j = i + 1;
                if (str.charAt(i) > str.charAt(j)) {
                    str = removeCharAt(str, i);
                    break;
                } else {
                    i += 1;
                }
                if(j==(len-1)){
                    str=removeCharAt(str,j);
                }
            }
        }
        return str;
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}

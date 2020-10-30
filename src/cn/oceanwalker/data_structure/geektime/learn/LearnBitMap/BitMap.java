package cn.oceanwalker.data_structure.geektime.learn.LearnBitMap;

public class BitMap {
    private final int nbits;
    private final char[] bytes;

    public BitMap(int n) {
        this.nbits = n;
        this.bytes = new char[n / 16 + 1];
    }

    public void set(int i) {
        if (i > nbits) {
            return;
        }
        int byteIndex = i / 16;
        bytes[byteIndex] |= 1 << i % 16;
    }

    public boolean get(int i) {
        if (i > nbits) {
            return false;
        }
        return (bytes[i / 16] &= 1 << i % 16) != 0;
    }

}

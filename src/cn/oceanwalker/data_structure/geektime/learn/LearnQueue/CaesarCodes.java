package cn.oceanwalker.data_structure.geektime.learn.LearnQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CaesarCodes {
    private final int[] keys;
    Queue<Integer> encodingQueue;
    Queue<Integer> decodingQueue;

    public CaesarCodes(int[] keys) {
        this.keys = keys;
    }

    private void initQueue(int[] keys) {
        encodingQueue = new LinkedList<>();
        decodingQueue = new LinkedList<>();
        int size = keys.length;
        for (int i = 0; i < size; i++) {
            System.out.println("add" + keys[i]);
            encodingQueue.add(keys[i]);
            decodingQueue.add(keys[i]);
        }
        System.out.println(encodingQueue.size());
        System.out.println(decodingQueue.size());
        System.out.println("initQueue over:" + this.toString());
    }


    public String encode(String text) {
        System.out.println("start encode:" + this.toString());
        String result = "";
        initQueue(keys);
        for (int i = 0; i < text.length(); i++) {
            int bias = encodingQueue.remove();
            encodingQueue.offer(bias);
            result += (char) (text.charAt(i) + bias);
        }
        return result;
    }

    @Override
    public String toString() {
        return "CaesarCodes{" +
                ", keys=" + Arrays.toString(keys) +
                ", encodingQueue=" + encodingQueue +
                ", decodingQueue=" + decodingQueue +
                '}';
    }

    public String decode(String encode) {
        System.out.println("start decode:" + this.toString());
        String result = "";
        initQueue(keys);
        for (int i = 0; i < encode.length(); i++) {
            int bias = decodingQueue.remove();
            decodingQueue.offer(bias);
            result += (char) (encode.charAt(i) - bias);
        }
        return result;
    }
}

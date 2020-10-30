package test.cn.oceanwalker.data_structure.geektime.learn.LearnQueue;

import cn.oceanwalker.data_structure.geektime.learn.LearnQueue.CaesarCodes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCaesarRepeat {
    @Test
    public void testCaesarEncode(){
        String text="abcd";
        int[] keys=new int[]{1,2};
        System.out.println("constractor");
        CaesarCodes codes=new CaesarCodes(keys);
        //abcdefg
        System.out.println("encode");
        assertEquals("bddf",codes.encode(text));
    }
    @Test
    public void testCaesarDecode(){
        String encode="bddf";
        int[] keys=new int[]{1,2};
        System.out.println("constractor");
        CaesarCodes codes=new CaesarCodes(keys);
        //abcdefg
        System.out.println("encode");
        assertEquals("abcd",codes.decode(encode));
    }
}

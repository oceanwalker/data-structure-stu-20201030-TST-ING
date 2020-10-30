package test.cn.oceanwalker.data_structure.geektime.learn.LearnGreedy;

import cn.oceanwalker.data_structure.geektime.learn.learnGreedy.DigitRemoveNumber;
import cn.oceanwalker.data_structure.geektime.learn.learnGreedy.MyRemoveNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRemoveNumber {
    @Test
    public void testMy(){
        assertEquals(3428, MyRemoveNumber.remove(7639428,3));
        assertEquals(45678, MyRemoveNumber.remove(495678,1));
        assertEquals(123, MyRemoveNumber.remove(123456,3));
        assertEquals(4459, MyRemoveNumber.remove(455684759,5));
    }
    @Test
    public void testDigit(){
        assertEquals("44594546", DigitRemoveNumber.remove("4556847594546",5));
        assertEquals("3428", DigitRemoveNumber.remove("7639428",3));
        assertEquals("45678", DigitRemoveNumber.remove("495678",1));
        assertEquals("123", DigitRemoveNumber.remove("123456",3));
    }

}

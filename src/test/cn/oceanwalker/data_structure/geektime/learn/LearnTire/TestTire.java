package test.cn.oceanwalker.data_structure.geektime.learn.LearnTire;

import cn.oceanwalker.data_structure.geektime.learn.LearnTire.Tire;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTire {
    @Test
    public void testTire(){
        char[] insert=new char[]{'t','e','s','t'};
        Tire tire=new Tire();
        tire.insert(insert);
        assertEquals(true,tire.find(insert));
    }
}

package test.cn.oceanwalker.data_structure.geektime.learn.LearnTire;

import cn.oceanwalker.data_structure.geektime.learn.LearnTire.AcMatch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAhoCorasick {
    @Test
    public void test(){
        AcMatch match=new AcMatch();
        char[] insert=new char[]{'t','e','s','t'};
        char[] insert1=new char[]{'t','e'};
        char[] insert2=new char[]{'e','s'};
        match.insert(insert);
        match.insert(insert1);
        match.insert(insert2);
        match.buildFailurePointer();
        assertEquals("02 12 04 ",match.match(insert));
    }
}

package test.cn.oceanwalker.data_structure.leetcode.linked_list;

import cn.oceanwalker.data_structure.leetcode.linked_list.ListNode;
import cn.oceanwalker.data_structure.leetcode.linked_list.ListNodeHelper;
import cn.oceanwalker.data_structure.leetcode.linked_list.MergeKSortedLists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMergeKSortedLists {
    @Test
    public void test() {
        ListNode[] lists = ListNodeHelper.createListNodeLists("  1->4->5,\n" +
                "  1->3->4,\n" +
                "  2->6");
        for (ListNode list : lists) {
            System.out.println(ListNodeHelper.print(list));
        }
        assertEquals("1->1->2->3->4->4->5->6", ListNodeHelper.print(MergeKSortedLists.myMerge20201013(lists)));
    }
}

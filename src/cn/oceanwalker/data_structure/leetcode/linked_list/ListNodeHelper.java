package cn.oceanwalker.data_structure.leetcode.linked_list;

public class ListNodeHelper {
    public static ListNode[] createListNodeLists(String str) {
        str = str.replaceAll("\\s", "");
        final String[] listSplit = str.split(",");
        ListNode[] result = new ListNode[listSplit.length];
        System.out.println("listSplit.length=" + listSplit.length);
        for (int j = 0; j < listSplit.length; j++) {
            String s = listSplit[j];
            System.out.println("j=" + j + " s=" + s);
            final String[] nodeSplit = s.split("->");
            ListNode lastNode = new ListNode(0);
            for (int i = 0; i < nodeSplit.length; i++) {
                int value = Integer.parseInt(nodeSplit[i]);
                ListNode curNode = new ListNode(value);
                if (i == 0) {
                    result[j] = curNode;
                    lastNode = curNode;
                }
                lastNode.next = curNode;
                lastNode = curNode;
            }
        }
        System.out.println(result.length);
        return result;
    }

    public static String print(ListNode node) {
        if (null == node) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        builder.append(node.val);
        node = node.next;
        while (null != node) {
            builder.append("->").append(node.val);
            node = node.next;
        }
        return builder.toString();
    }
}

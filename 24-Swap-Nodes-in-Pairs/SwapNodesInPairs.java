public class SwapNodesInPairs {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode cur = head;
        ListNode dum = new ListNode(0, head);
        ListNode prev = dum;
        ListNode nn;

        while (cur != null && cur.next != null) {
            nn = cur.next;
            cur.next = nn.next;
            nn.next = cur;
            prev.next = nn;
            prev = cur;
            cur = cur.next;
        }

        return dum.next;
    }
}

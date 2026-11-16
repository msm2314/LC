public class ReverseNodesInKGroupByCount {
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

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dum = new ListNode(0, head);
        ListNode prev = dum;
        ListNode cur = prev.next;
        ListNode nn;
        int count = 0;

        while (cur != null) {
            count++;
            cur = cur.next;
        }

        cur = prev.next;
        while (count >= k) {
            for (int i = 0; i < k - 1; i++) {
                nn = cur.next;
                cur.next = nn.next;
                nn.next = prev.next;
                prev.next = nn;
            }
            prev = cur;
            cur = cur.next;
            count -= k;
        }

        return dum.next;
    }
}

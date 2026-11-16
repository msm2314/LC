public class ReverseLinkedListII {
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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dum = new ListNode(0, head);
        ListNode prev = dum;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode cur = prev.next;
        for (int i = 0; i < right - left; i++) {
            ListNode nn = cur.next;
            cur.next = nn.next;
            nn.next = prev.next;
            prev.next = nn;
        }

        return dum.next;
    }
}

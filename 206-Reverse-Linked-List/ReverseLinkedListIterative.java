public class ReverseLinkedListIterative {
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

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode front;
        ListNode prev = null;

        while (cur != null) {
            front = cur.next;
            cur.next = prev;
            prev = cur;
            cur = front;
        }

        return prev;
    }
}

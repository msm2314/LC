public class ReverseNodesInEvenLengthGroups {
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

    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dum = new ListNode(0, head);
        ListNode pge = dum;
        int tl = 1;
        int al;

        while (pge.next != null) {
            ListNode scout = pge;
            al = 0;
            while (al < tl && scout.next != null) {
                scout = scout.next;
                al++;
            }

            if (al % 2 != 0) {
                pge = scout;
            } else {
                ListNode cur = pge.next;
                for (int i = 0; i < al - 1; i++) {
                    ListNode nn = cur.next;
                    cur.next = nn.next;
                    nn.next = pge.next;
                    pge.next = nn;
                }
                pge = cur;
            }
            tl++;
        }

        return dum.next;
    }
}

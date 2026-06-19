class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return dummy.next;
    }
}

// Algorithm - O(n + m) time, O(1) space
// Test: [1,2,4] + [1,3,4] -> [1,1,2,3,4,4]
import java.util.Arrays;

class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        int n = start.length;

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0;
        int count = 0;
        int maxi = 0;

        while (i < n && j < n) {
            if (start[i] < end[j]) {
                count++;
                maxi = Math.max(maxi, count);
                i++;
            } else {
                // A room can be reused when a meeting ends at this start time.
                count--;
                j++;
            }
        }

        return maxi;
    }
}

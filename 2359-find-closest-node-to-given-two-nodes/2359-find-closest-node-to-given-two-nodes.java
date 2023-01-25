class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        if (edges == null || edges.length < 2) {
            return -1;
        }

        int len = edges.length;
        int[] visit1 = new int[len];
        int[] visit2 = new int[len];

        int res = len;
        while (node1 != -1 || node2 != -1) {
            if (node1 != -1) {
                if (visit2[node1] == 1) {
                    res = Math.min(res, node1);
                }

                if (visit1[node1] == 1) {
                    node1 = -1;
                } else {
                    visit1[node1] = 1;
                    node1 = edges[node1];
                }
            }
            if (node2 != -1) {
                if (visit1[node2] == 1) {
                    res = Math.min(res, node2);
                }
                if (visit2[node2] == 1) {
                    node2 = -1;
                } else {
                    visit2[node2] = 1;
                    node2 = edges[node2];
                }
            }

            if (res < len) {
                return res;
            }
        }

        return -1;
    }
}
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0] - coordinates[1][0];
        int y1 = coordinates[0][1] - coordinates[1][1];
        int[] prev = coordinates[1];
        for (int i = 2; i < coordinates.length; ++i) {
            int[] point = coordinates[i];
            int x2 = point[0] - prev[0];
            int y2 = point[1] - prev[1];
            if (x1 * y2 != x2 * y1) {
                return false;
            }
        }
        return true;
    }
}

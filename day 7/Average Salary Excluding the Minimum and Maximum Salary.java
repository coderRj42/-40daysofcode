class Solution {
 public double average(int[] salary) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        double sum = 0;
        for (int j : salary) {
            sum += j;
            if (j < min) min = j;
            if (j > max) max = j;
        }
        return (sum - min - max) / (salary.length - 2);
    }
}

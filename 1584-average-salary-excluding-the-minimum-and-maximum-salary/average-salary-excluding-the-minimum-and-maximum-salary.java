class Solution {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        int sum = 0;

        for (int x : salary) {
            if (x > max)
                max = x;
            if (x < min)
                min = x;
            sum += x;
        }

        sum = sum - min - max;

        double avg = (double) sum / (salary.length - 2);
        return avg;
    }
}
class Solution {
    public double average(int[] salary) {
      final int N = salary.length;
        Arrays.sort(salary);
        double t = salary[1];
        for (int i = 2; i < N - 1; i++) {
            t += salary[i];
        }
        return t / (N - 2);  
    }
}


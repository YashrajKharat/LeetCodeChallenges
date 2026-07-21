class Solution {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;

        double n = x;
        double eps = 1e-6;

        while (Math.abs(n - x / n) > eps) {
            n = (n + x / n) / 2;
        }

        return (int) n;
    }
}
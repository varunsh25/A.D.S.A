class lcm{
    static int[] lcmAndGcd(int a, int b) {
        int gcdVal = gcd(a, b);
        int lcmVal = (a * b) / gcdVal;
        return new int[]{lcmVal, gcdVal};
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
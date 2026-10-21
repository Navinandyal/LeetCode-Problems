class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        char[] b = a.clone();
        Arrays.sort(b);

        if (Arrays.equals(a, b)) return 0;
        if (n == 2) return -1;

        char mn = b[0];
        char mx = b[n - 1];

        if (a[0] == mn || a[n - 1] == mx) return 1;

        boolean minInPrefix = false;
        boolean maxInSuffix = false;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] == mn) minInPrefix = true;
        }

        for (int i = 1; i < n; i++) {
            if (a[i] == mx) maxInSuffix = true;
        }

        if (minInPrefix || maxInSuffix) return 2;

        return 3;
    }
}
package Solution70;

/*算出規律為On = On-1 + On-2
*/
public class ClimingStairs {
    // Solution 70
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i-1] = arr[i - 2] + arr[i - 3];
        }
        return arr[n - 1];

    }

}

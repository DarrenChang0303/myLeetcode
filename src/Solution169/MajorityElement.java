package Solution169;

public class MajorityElement {

    public static void main(String[] args) {
        MajorityElement test = new MajorityElement();
        int[] array = new int[] { 3, 3, 4, 4, 3, 3, 3, 5 };
        int ans = test.majorityElement(array);
        System.out.println(ans);
    }

    public int majorityElement(int[] nums) {
        int number = nums.length / 2;
        int val = 0;
        int rex = 0;
        for (int i = 0; i < nums.length; i++) {
            rex = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    rex++;
                }
                if (rex > number) {
                    val = nums[i];
                    return val;
                }
            }
        }
        return 0;
    }

}

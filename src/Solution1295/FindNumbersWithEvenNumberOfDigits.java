package Solution1295;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
		int[] array=new int[] {12,345,2,6,7806};
		System.out.println(findNumbers(array));
	}
	
	public static int findNumbers(int[] nums) {
		int n = 0;
		for (int i = 0; i < nums.length; i++) {

			int x = numberCheck(nums[i]);
			if (x % 2 == 0) {
				n++;
			}
		}
		return n;
	}

	public static int numberCheck(int num) {
		int n = 1;
		while (true) {
			int y = num / 10;
			if (y == 0) {
				break;
			} else {
				num = y;
				n++;
			}
		}
		return n;
	}
}

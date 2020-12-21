package Solution1431;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		int i, j;
		List<Boolean> ans = new ArrayList<>();
		for (i = 0; i < candies.length; i++) {
			if (i != j) {
				for (j = 0; j < candies.length; j++)
					if (candies[i] + extraCandies > candies[j]) {
						ans[i] = true;
					}
				ans[i] = false;

			}

		}
	}
    
}

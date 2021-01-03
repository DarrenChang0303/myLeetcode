package Solution1431;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		int max=0;
		List<Boolean> ans = new ArrayList<>();
		// ArrayList sort = new ArrayList<>();
		// sort = candies;
		// Arrays.sort(candies);

		for(int i=0,j=1;j<candies.length;j++){
			if(candies[i]>candies[j]){
				max = candies[i];
			}
			if(candies[i]<candies[j]){
				max = candies[j];
				i=j;
			}
			}
			
		

		for (int i = 0; i < candies.length; i++) {
			if(candies[i]+extraCandies>=max){
				ans.add(true);
			}
			if(candies[i]+extraCandies<max){
				ans.add(false);
			}


			}
			return ans;
		}
	}
    


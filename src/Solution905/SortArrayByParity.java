package Solution905;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {

		int[] arr=new int[A.length];
		int j=0,k=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]%2==0) {
				arr[j]=A[i];
				j++;
			}
			else {
				arr[arr.length-1-k]=A[i];
				k++;
			}
		}
		
		return arr;
	}
}

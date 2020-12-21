package Solution1486;

public class XOROperationInAnArray {

    public int xorOperation(int n, int start) {
        int[] array = new int[n];
        for(int i=0;i<n;i++) {
            array[i]=start+2*i;
        }
            int x=0;
           int answer=0;
           for(int j=0;j<n;j++) {
               x=array[j];
               answer=answer^x;
           }
           return answer;
       }
    
}

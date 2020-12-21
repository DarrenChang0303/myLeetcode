package Solution89;

import java.util.ArrayList;
import java.util.List;
//solution89
public class GrayCode {
    public List<Integer> grayCode(int n) {
        int x= n-1;
        int num = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        if(n==0){
        arr.add(0);
        return arr;
        }
        for(int i=0;i<=x;i++){
            num = num*2;
            arr.add(num);
        }
        return arr;
    }
}

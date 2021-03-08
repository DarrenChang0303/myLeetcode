package Solution217;

import java.util.Hashtable;
import java.util.Map;



public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer,Integer> collect = new Hashtable<>();
        boolean res = true;
        for(int element: nums){
            if(collect.containsKey(element)){
                collect.put(element, collect.get(element)+1);
            }else{
                collect.put(element, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: collect.entrySet()){
            if(entry.getValue()>1){
                res = true;
                break;
            }else{
                res=false;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        ContainsDuplicate test = new ContainsDuplicate();
        int[] nums = new  int[]{1,2,3,1};

        System.out.println(test.containsDuplicate(nums));
    }
    
}

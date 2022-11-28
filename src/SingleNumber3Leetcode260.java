import java.util.HashMap;
public class SingleNumber3Leetcode260 {

    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int i,flag=0;
        int arr[]=new int[2];
        for(i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        for(int k:hm.keySet())
        {
            if(hm.get(k)==1)
            {
                arr[flag]=k;
                flag+=1;
            }
            if(flag==2)
                return arr;

        }
        return arr;
    }
}

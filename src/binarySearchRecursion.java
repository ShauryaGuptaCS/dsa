public class binarySearchRecursion {
    public int binarySearch(int nums[],int low,int mid,int high,int e){
        if(e==nums[mid]){
            return mid;
        }
        else if(e>nums[mid]){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
        mid=(low+high)/2;
        if(low>high){
            return -1;
        }
        return binarySearch(nums,low,mid,high,e);

    }
    public static void main(String[] args) {

        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int i;
        int e=8;
        int low=0,high=nums.length-1,mid=(low+high)/2;
        binarySearchRecursion ob=new binarySearchRecursion();
        int ans=ob.binarySearch(nums,low,mid,high,e);
        System.out.println(ans);
    }
}

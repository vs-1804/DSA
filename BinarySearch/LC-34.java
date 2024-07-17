//34. Find First and Last Position of Element in Sorted Array
class Solution {
    public int lowerBinary(int[] arr, int target) {
        int ans=-1;int left=0;
        int right=arr.length-1;
    	while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]==target) {
				ans=mid;
				right=mid-1;
			}
			else if(arr[mid]>=target) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
	return ans;
    }
    	public  int upperBinary(int[] arr, int target) {
		int left = 0; int ans=-1;
		int right = arr.length - 1;
			while (left <= right) {
			int mid=left+(right-left)/2;
			if(arr[mid]==target) {
				ans=mid;
				left=mid+1;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}
			else{
				right=mid-1;
			}
		}
		return ans;
	}
    public int[] searchRange(int[] nums, int target) {
         int a=lowerBinary( nums, target);
         int y= upperBinary(nums,  target);
           return new int[]{a,y};
    }
}

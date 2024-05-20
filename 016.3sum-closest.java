class Solution {
    public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
	    int res = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length-2; i++) {
        	int left = i+1;
        	int right = nums.length -1 ;
        	while(left < right){
        		int sum = nums[i] + nums[left] + nums[right];
        		int diff = Math.abs(sum - target);
        		if(diff< min) {
        			min = diff;
        			res= sum;
        		}
        		if(sum < target) left++;
        		else if(sum > target) right--;
        		else return sum;
        	}
        	
        }
        return res;

    }
}
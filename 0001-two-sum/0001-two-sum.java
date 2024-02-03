class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] index = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
            
        // int[] index = new int[2];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){

        //         if(nums[j] == target - nums[i]){
        //             // nums[i]+nums[i+1] = target;
        //             return new int[]{i,j};
        //         }
        //     }

        // }
        // return new int[]{};
    }
}
class MinPairSum {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int out = Integer.MIN_VALUE;

        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum > out){
                out = sum;
            }
            i++;
            j--;
        }
        return out;
    }
}

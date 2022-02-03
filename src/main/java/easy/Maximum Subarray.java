public int maxSubArray(int[] nums) {
    int largestSum=nums[0];
    int subSum;
    for(int i=0;i<nums.length;i++){
       subSum=0;
       for(int j=i;j<nums.length;j++){
         subSum += nums[j];
         if(subSum>largestSum)largestSum = subSum;
        }
     }return largestSum;
}

//1차 time limit....

import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] twoSum(int[] nums,int target){
		Map<Integer,Integer> numMap = new HashMap<>();
		int[] answer = new int[2];
		IntStream.range(0,nums.length).forEach(i->{			
			if(numMap.containsKey(target-nums[i])){
				answer[0] = numMap.get(target-nums[i]);
				answer[1] = i;
				return;
			}
			numMap.put(nums[i],i);
		});
		
		return answer;

	}
}


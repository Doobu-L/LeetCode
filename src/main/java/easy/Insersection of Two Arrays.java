import java.util.*;

class Solution {
   public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer,Integer> numMap = new HashMap<>();
    int[] answer = null;
    if(nums1.length > nums2.length){
      Arrays.stream(nums1).boxed().forEach(num-> numMap.put(num,numMap.getOrDefault(num,0)+1));
      answer = Arrays.stream(nums2).boxed().filter(num -> numMap.getOrDefault(num,0)>0).mapToInt(num -> {
        numMap.put(num,numMap.get(num)-1);
        return num;
      }).toArray();
    }else{
      Arrays.stream(nums2).boxed().forEach(num-> numMap.put(num,numMap.getOrDefault(num,0)+1));
      answer = Arrays.stream(nums1).boxed().filter(num -> numMap.getOrDefault(num,0)>0).mapToInt(num -> {
        numMap.put(num,numMap.get(num)-1);
        return num;
      }).toArray();
    }

    return answer;
  }
}

//성능은 최하위지만 stream을 사용해서 구현하고 

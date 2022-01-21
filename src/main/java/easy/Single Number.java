import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> numberCnt = new HashMap<>();
        int result=0;
        for(int num:nums){
            if(numberCnt.containsKey(num)){
                numberCnt.replace(num,numberCnt.get(num)+1);
                result-=num;
            }else{
                numberCnt.put(num,0);
                result+=num;
            }
        }
        return result;
        
    }
}

//성능이 매우 안좋다 if문 안에 nums^=num 으로 XOR 연산으로 성능 향상을 시킬 방법이있음.

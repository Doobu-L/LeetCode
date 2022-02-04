import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		Arrays.copyOfRange(nums1,0,m);
		IntStream.range(0,n).forEach(i -> {
			nums1[m+i]=nums2[i];
		});
		Arrays.sort(nums1);
	}
}

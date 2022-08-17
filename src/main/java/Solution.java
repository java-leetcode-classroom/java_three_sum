import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    int n = nums.length;
    if (n < 3) {
      return null;
    }
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    for (int pivot = 1; pivot < n - 1; pivot++) {
      int start = 0, end = n - 1;
      if (pivot > 1 && nums[pivot] == nums[pivot-1]) {
        start = pivot - 1;
      }
      while( start < pivot && pivot < end) {
        if (start > 0 && nums[start] == nums[start-1]) {
          start++;
          continue;
        }
        if (end < n-1 && nums[end] == nums[end+1]) {
          end--;
          continue;
        }
        int sum = nums[start] + nums[pivot] + nums[end];
        if (sum == 0) {
          result.add(List.of(nums[start], nums[pivot], nums[end]));
          start++;
          end--;
        } else if (sum > 0) {
          end--;
        } else {
          start++;
        }
      }
    }
    return result;
  }
}

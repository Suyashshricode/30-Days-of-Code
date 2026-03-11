package Day4;

import java.util.*;
public class SubarraySum {

  public int subArraySum(int n , int[]nums , int k)
  {
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0, 1);
    int prefixSum = 0;
    int count=0;

    for(int i=0; i<n; i++)
    {
      prefixSum+=nums[i];
      int rem = prefixSum-k;
      if(map.containsKey(rem))
      {
        count+= map.get(rem);
      }
      map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int nums[] = new int[n];
    for(int i=0; i<n; i++)
    {
      nums[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    sc.close();
    
    SubarraySum obj = new SubarraySum();
    System.out.println(obj.subArraySum(n, nums, k));
  }
}

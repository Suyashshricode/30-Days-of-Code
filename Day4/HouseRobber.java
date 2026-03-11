package Day4;
import java.util.*;
public class HouseRobber {
  public static int rob(int[]nums , int index)
  {

    if(index == 0)
    {
      return nums[0];
    }

    if(index<0)
    {
      return 0;
    }
    
    int pick = nums[index] + rob(nums, index-2);
    int notPick = 0 + rob(nums, index-1);

    return Math.max(pick , notPick);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int nums[] = new int[n];
    for(int i=0; i<n; i++)
    {
      nums[i] = sc.nextInt();
    }

    sc.close();
    System.out.println(rob(nums, n-1));
  }
}

package Day8;
import java.util.*;
public class LC55JumpGame {

  public static boolean jumpGame(int nums[])
  {
    int n = nums.length;
    int maxReachable=0;

    for(int i=0; i<n; i++)
    {
      if(i>maxReachable)
      {
        return false;
      }
      maxReachable = Math.max(maxReachable, i+nums[i]);
    }
    return true;
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
    
    System.out.println(jumpGame(nums));
  }
}

package Day9;

public class LC45JumpGame2 {
  public static int jumpGame2(int nums[])
  {
      int n = nums.length;
        int jumps=0;
        int l=0; 
        int r=0;

        while(r<n-1)
        {
            int farthest = 0;
            for(int i=l; i<=r; i++)
            {
                farthest = Math.max(i+nums[i] , farthest);
            }
            l = r+1;
            r = farthest;
            jumps++;
        }
        return jumps;
  }
  public static void main(String[] args) {
    int nums [] = {2,3,1,1,4};
    System.out.println(jumpGame2(nums));
  }
}

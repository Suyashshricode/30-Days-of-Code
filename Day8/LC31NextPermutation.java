package Day8;
import java.util.*;

public class LC31NextPermutation {

  public static void nextPermutation(int nums[])
  {
        int n = nums.length;
        int index=-1; 
        for(int i=n-2; i>=0; i--)
        {
            if(nums[i]<nums[i+1])
            {
                index = i;
                break;
            }
        }

        if(index==-1)
        {
            reverse(nums , 0 , n-1);
            return;
        }

        for(int i=n-1; i>index; i--)
        {
            if(nums[i] > nums[index])
            {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        reverse(nums , index+1 , n-1);

        for(int i=0; i<n; i++)
        {
          System.out.print(nums[i] + " ");
        }
  }

   public static void reverse(int []nums , int start , int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp; 
            start++;
            end--;
        }
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nums[]= new int[n];
    for(int i=0; i<n; i++)
    {
      nums[i]=sc.nextInt();
    }
    sc.close();

    nextPermutation(nums);
  }
}

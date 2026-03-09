package Day2;
public class ReverseInteger {

  public static int reverseInt(int x)
  {
    int ans=0; 
    while (x!=0)
    {
      int digit = x%10;
      ans = ans*10 + digit;
      x = x/10;
    }
    return ans;
  }
  public static void main(String[] args) {
    System.out.println(reverseInt(255));
    System.out.println(reverseInt(-2558));
  }
}

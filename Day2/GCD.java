package Day2;

public class GCD {
  public static int calcGcd(int n1 , int n2)
  {
    int gcd = 1;
    for(int i=1; i<(Math.min(n1,n2)); i++)
    {
      if(n1%1 == 0 && n2%i == 0)
      {
        gcd = i;
      }
    }
    return gcd;
  }
  public static void main(String[] args) {
    System.out.println(calcGcd(15, 3));
    System.out.println(calcGcd(255, 90));
  }
}

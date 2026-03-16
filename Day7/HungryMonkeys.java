package Day7;

import java.util.*;
public class HungryMonkeys {

  
  public static int hungryMonkeys(int n , int k , int j , int m , int p)
  {
    int bananaEat = m/k;
    int remBanana = m%k;

    int peanutEat = p/j;
    int remPeanut = p%j;

    int hungryMonkey = n - (bananaEat+peanutEat);

    if(remBanana!=0 || remPeanut!=0)
    {
      hungryMonkey = hungryMonkey-1;
    }
    return hungryMonkey;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int j = sc.nextInt();
    int m = sc.nextInt();
    int p = sc.nextInt();
    sc.close();
    System.out.println(hungryMonkeys(n,k,j,m,p));
  }
}

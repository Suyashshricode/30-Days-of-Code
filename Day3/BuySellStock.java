package Day3;
import java.util.*;

public class BuySellStock {

  public int bestTimeToBuy(int n , int [] prices)
  {
    int bestBuy = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i=0; i<n; i++)
    {
      bestBuy = Math.min(bestBuy , prices[i]);
      if(bestBuy<prices[i])
      {
        int profit = prices[i] - bestBuy;
        maxProfit = Math.max(profit , maxProfit);
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int prices[] = new int[n];
    for(int i=0; i<n; i++)
    {
      prices[i] = sc.nextInt();
    }

    sc.close();
    BuySellStock obj = new BuySellStock();
    System.out.println(obj.bestTimeToBuy(n, prices));
  }
}

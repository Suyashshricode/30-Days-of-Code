import java.util.*;

public class MaxCardPoints {

    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;

        for (int i = 0; i <= k - 1; i++) {
            leftSum += cardPoints[i];
            maxSum = leftSum;
        }

        int rightIndex = n - 1;

        for (int i = k - 1; i >= 0; i--) {
            leftSum = leftSum - cardPoints[i];
            rightSum = rightSum + cardPoints[rightIndex];
            rightIndex--;

            maxSum = Math.max(maxSum, leftSum + rightSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of cards: ");
        int n = sc.nextInt();

        int[] cardPoints = new int[n];

        // Input array elements
        System.out.println("Enter card points:");
        for (int i = 0; i < n; i++) {
            cardPoints[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = maxScore(cardPoints, k);

        System.out.println("Maximum Score: " + result);

        sc.close();
    }
}

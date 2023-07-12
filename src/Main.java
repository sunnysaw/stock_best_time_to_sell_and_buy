import java.util.Scanner;
public class Main {
    public  static  int maxProfit(int[] prices) {
        // Your code goes here
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int loop = 0;
        int max = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < min) {
                min = prices[i];
                loop = i;
            }
        }
            for (int j = loop; j < prices.length; j++) {
                if (max < prices[j]) {
                    max = prices[j];
                }
            }
            if (min > max){
                return 0;
            }
            return max - min;
        }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int arr = input.nextInt();
        int[] arrt = new int[arr];
        System.out.println("Enter the element inside array :");
        for (int i = 0; i < arrt.length; i++){
            arrt[i] = input.nextInt();
        }
        System.out.println(maxProfit(arrt));
    }
}
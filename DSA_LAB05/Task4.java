/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB05;

/**
 *
 * @author Muzamuil Ahmed
 */
public class Task4 {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] > prices[i + 1]) prices[i] = prices[i] - prices[i + 1];
            else if (prices[i] < prices[i + 1]) prices[i] = prices[i + 1] - prices[i];
        }
        return prices;
    }
    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        prices = new Task4().finalPrices(prices);
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}

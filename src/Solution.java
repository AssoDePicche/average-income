package src;

import java.util.Scanner;

public class Solution {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    double a, b, c;

    Scanner scanner = new Scanner(System.in);

    a = parseNextLine();

    b = parseNextLine();

    c = parseNextLine();

    scanner.close();

    AverageIncomeCalculator.calculateAverage(a, b, c);
  }

  private static String getNextLine() {
    return scanner.nextLine().replace(',', '.');
  }

  private static double parseNextLine() {
    return Double.valueOf(getNextLine());
  }
}

package src;

public class AverageIncomeCalculator {
  public static void calculateAverage(double... incomes) {
    int months = incomes.length;

    double earnings = 0;

    for (double earning : incomes) {
      earnings += earning;
    }

    System.out.println(earnings / months);
  }
}

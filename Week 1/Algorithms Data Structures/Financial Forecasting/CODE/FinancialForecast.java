public class FinancialForecast {

    public static double futureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return futureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05;
        int years = 5;

        double answer = futureValue(initialValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: " + answer);
    }
}

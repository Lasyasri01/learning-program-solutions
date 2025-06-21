/*
📘 What is Recursion?

Recursion is when a method calls itself to solve smaller parts of a problem.

Here, to predict the future value, we assume:
Future Value = Previous Year's Value × (1 + growthRate / 100)

So we recursively compute:
FV(5) = FV(4) * (1 + r)
     = FV(3) * (1 + r)^2
     ...
     = initialValue * (1 + r)^years

📈 Time Complexity:

Without optimization:
- Time: O(n)
- Space: O(n) (because of the recursive call stack)

🛠️ Optimization Idea:

Use memoization to store intermediate values if this method is called repeatedly in real-time systems.
Or use an iterative version to reduce stack usage.
*/
public class FinancialForecast {

    public static double predictValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }

       
        return predictValue(initialValue, growthRate, years - 1) * (1 + growthRate / 100);
    }

    public static void main(String[] args) {
        double initial = 10000;    
        double rate = 8;            
        int nYears = 5;            

        double predicted = predictValue(initial, rate, nYears);

        System.out.println("Initial Value: ₹" + initial);
        System.out.println("Growth Rate: " + rate + "% per year");
        System.out.println("Years: " + nYears);
        System.out.printf("Predicted Value after %d years: ₹%.2f\n", nYears, predicted);
    }
}

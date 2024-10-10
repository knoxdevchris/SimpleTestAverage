import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class TestAverage here.
 *
 * @author Chris Miller
 * @version 10/9/2024
 */
public class TestAverage {
    public static void main(String[] args) {
        ArrayList<Integer> TestScores = new ArrayList<>();
        
        // Add test scores to the ArrayList
        TestScores.add(90);
        TestScores.add(85);
        TestScores.add(95);
        TestScores.add(100);
        TestScores.add(70);
        
        // Sort the test scores
        Collections.sort(TestScores);
        
        // Remove the lowest score (first element) and the highest score (last element)
        TestScores.remove(0);  // Remove the lowest score
        TestScores.remove(TestScores.size() - 1);  // Remove the highest score
        
        // Calculate the average of the remaining scores
        double average = calculateAverage(TestScores);
        
        // Print the result
        System.out.println("Average Test Score: " + average);
    }

    // Method to calculate the average
    public static double calculateAverage(ArrayList<Integer> TestAverage) {
        int sum = 0;
        
        // Sum all remaining test scores
        for (int num : TestAverage) {
            sum += num;
        }
        
        // Return the average
        return (double) sum / TestAverage.size();
    }
}

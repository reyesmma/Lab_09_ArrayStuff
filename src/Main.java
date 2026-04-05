import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[] dataPoints = new int[100];
        Random rnd = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        double sum = 0;
        double average = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        average = sum / dataPoints.length;
        System.out.println();
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        int value = SafeInput.getRangedInt(in, "Enter a integer [1, 100]", 1, 100);

        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == value)
                count++;
        }
        System.out.println("The value " + value + " was found " + count + " times in the array.");

        int index = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == value) {
                index = i;
                break;
            } else
                index = -1;
        }
        if (index > 0)
            System.out.println("The value " + value + " was found at array index " + index + ".");
        else
            System.out.println("The value " + value + " was not found in the array.");

        int min = 100;
        int max = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] > max)
                max = dataPoints[i];
            if (dataPoints[i] < min)
                min = dataPoints[i];
        }
        System.out.println("The minimum value is " + min + ".");
        System.out.println("The maximum value is " + max + ".");

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[])
    {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        average = sum / values.length;
        return average;
    }
}

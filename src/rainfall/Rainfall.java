import java.util.Scanner;
/*Prog that creates a class and stores the total rainfall for each month into an array
of doubles and demonstrates the class in a coplete class*/
public class Rainfall{
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        final int SIZE = 12;
        double[] monthlyRain = new double[SIZE];
        
        System.out.println("Enter the monthly rainfall amount: ");
        int i = 0;
        
        //Added inut validation using Do While loop
        for (i = 0; i < SIZE; i++) {
            do {
                System.out.println("Month" + (i + 1) + ": ");
                monthlyRain[i] = keyboard.nextDouble();
            }
            while (monthlyRain[i] < 0);
        }
        
        System.out.println("The annual sum of rain: " + sumRain(monthlyRain));
        
        System.out.println("The average sum of rain: " + averageRain(monthlyRain));
        
        System.out.println("The most amount of rainfall: " + mostRain(monthlyRain));
        
        System.out.println("The least amont of rainfall: " + leastRain(monthlyRain));
    }
    
    //Function that returns the total rainfall for the year.
    static double sumRain(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    
    //Function that returns the average monthly rainfall
    static double averageRain(double[] array) {
        double average = 0;
        average = sumRain(array)/array.length;
        return average;
    }
    
    //Function that rerurns the month with the most rain
    static double mostRain(double[] array) {
        double most = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > most) {
                most = array[i];
            }
        }
        return most;
    }
    //Function that returns the month with the least rain
    static double leastRain(double[] array) {
        double least = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < least) {
                least = array[i];
            }
        }
        return least;
    }
}
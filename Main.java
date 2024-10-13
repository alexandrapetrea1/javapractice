import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] grades = {29, 37, 38, 41, 84, 67};

        Aufgabe1 aufgabe1 = new Aufgabe1();

        System.out.println("Failing grades: " + aufgabe1.getFailingGrades(grades));
        System.out.println("Average grade: " + aufgabe1.calculateAverage(grades));
        System.out.println("Rounded grades: ");
        for (int grade : aufgabe1.roundGrades(grades)) {
            System.out.print(grade + " ");
        }
        System.out.println();
        System.out.println("Maximum rounded grade: " + aufgabe1.getMax(grades));


        int[] numbers = {4, 8, 3, 10, 17};

        Aufgabe2 aufgabe2 = new Aufgabe2();

        System.out.println("Maximum number: " + aufgabe2.findMax(numbers));
        System.out.println("Minimum number: " + aufgabe2.findMin(numbers));
        System.out.println("Maximum sum of n-1 numbers: " + aufgabe2.findMaxSum(numbers));
        System.out.println("Minimum sum of n-1 numbers: " + aufgabe2.findMinSum(numbers));
        Aufgabe3 aufgabe3 = new Aufgabe3();

        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0, 0};

        // Test sum
        System.out.println("Sum: " + Arrays.toString(aufgabe3.sum(num1, num2)));

        // Test difference
        int[] num3 = {8, 3, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {5, 4, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("Difference: " + Arrays.toString(aufgabe3.difference(num3, num4)));

        // Test multiplication by a single digit
        int[] num5 = {2, 3, 6, 0, 0, 0, 0, 0};
        int digit = 2;
        System.out.println("Multiplication: " + Arrays.toString(aufgabe3.MultiplyBySingleDigit(num5, digit)));

        // Test division by a single digit
        int[] num6 = {2, 3, 6, 0, 0, 0, 0, 0};
        int divisor = 2;
        System.out.println("Division: " + Arrays.toString(aufgabe3.divideBySingleDigit(num6, divisor)));
    }
}

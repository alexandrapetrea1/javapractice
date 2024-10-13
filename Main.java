import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Aufgabe 1");
        int[] grades = {29, 37, 38, 41, 84, 67};

        Aufgabe1 aufgabe1 = new Aufgabe1();

        List<Integer> failingGrades = aufgabe1.getFailingGrades(grades);
        double averageGrade = aufgabe1.calculateAverage(grades);
        int[] roundedGrades = aufgabe1.roundGrades(grades);
        int maxRoundedGrade = aufgabe1.getMax(grades);

        System.out.println("Failing grades: " + failingGrades);
        System.out.println("Average grade: " + averageGrade);
        System.out.println("Rounded grades: " + Arrays.toString(roundedGrades));
        System.out.println("Maximum rounded grade: " + maxRoundedGrade);
        System.out.println();

        System.out.println("Aufgabe 2");
        int[] numbers = {4, 8, 3, 10, 17};

        Aufgabe2 aufgabe2 = new Aufgabe2();

        int maxNumber = aufgabe2.findMax(numbers);
        int minNumber = aufgabe2.findMin(numbers);
        int maxSum = aufgabe2.findMaxSum(numbers);
        int minSum = aufgabe2.findMinSum(numbers);

        System.out.println("Maximum number: " + maxNumber);
        System.out.println("Minimum number: " + minNumber);
        System.out.println("Maximum sum of n-1 numbers: " + maxSum);
        System.out.println("Minimum sum of n-1 numbers: " + minSum);
        System.out.println();

        System.out.println("Aufgabe 3");
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0, 0};

        Aufgabe3 aufgabe3 = new Aufgabe3();

        int[] sum = aufgabe3.sum(num1, num2);
        int[] difference = aufgabe3.difference(num2, num1);
        int[] product = aufgabe3.MultiplyBySingleDigit(num1, 2);
        int[] quotient = aufgabe3.divideBySingleDigit(num1, 2);

        System.out.println("Sum: " + Arrays.toString(sum));
        System.out.println("Difference: " + Arrays.toString(difference));
        System.out.println("Multiplication by 2: " + Arrays.toString(product));
        System.out.println("Division by 2: " + Arrays.toString(quotient));

        Aufgabe4 aufgabe4 = new Aufgabe4();

        System.out.println("Aufgabe 4");

        int[] keyboards = {40, 35, 70, 15, 45};
        int[] usbDrives = {20, 15, 40, 15};
        int budget = 30;

        int cheapestKeyboard = aufgabe4.findCheapestKeyboard(keyboards);
        System.out.println("Cheapest keyboard: " + cheapestKeyboard);

        int mostExpensiveItem = aufgabe4.findMostExpensiveItem(keyboards, usbDrives);
        System.out.println("Most expensive item: " + mostExpensiveItem);

        int mostExpensiveAffordableUSB = aufgabe4.findMostExpensiveAffordableUSB(usbDrives, budget);
        System.out.println("Most expensive USB Markus can afford: " + mostExpensiveAffordableUSB);

        int maxSpend = aufgabe4.findMaxSpend(keyboards, usbDrives, budget);
        System.out.println("Maximum spend Markus can afford: " + maxSpend);

    }
}

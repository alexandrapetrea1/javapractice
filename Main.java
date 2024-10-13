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
    }
}

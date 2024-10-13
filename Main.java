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
    }
}

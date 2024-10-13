import java.util.ArrayList;
import java.util.List;

public class Aufgabe1{
    List<Integer> getFailingGrades(int[] grades) {
        List<Integer> failingGrades = new ArrayList<>();
        for (int grade : grades)
            if(grade < 40) failingGrades.add(grade);
        return failingGrades;
    }

    public static double calculateAverage(int[] grades){
        int sum = 0;
        for(int grade : grades)
            sum = sum + grade;
        return (double) sum / grades.length;
    }

    public static int[] roundGrades(int[] grades){
        int[] roundedGrades = new int[grades.length];
        for(int i = 0; i < grades.length; i++){
            int grade = grades[i];
            if(grade >= 38 && (5- (grade % 5)) < 3){
                roundedGrades[i] = grade + (5 - (grade % 5));
            }
            else roundedGrades[i] = grade;
        }
        return roundedGrades;
    }

    public static int getMax(int[] grades){
        int[] roundedGrades = roundGrades(grades);
        int max = roundedGrades[0];
        for(int grade : roundedGrades)
            if(grade > max) max = grade;
        return max;
    }

}
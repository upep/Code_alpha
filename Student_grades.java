import java.util.ArrayList;
import java.util.Scanner;


public class Student_grades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter the grade for student " + i + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        System.out.println("Average Grade: " + calculateAverage(grades));
        System.out.println("Highest Grade: " + highestGrade(grades));
        System.out.println("Lowest Grade: " + lowestGrade(grades));

        scanner.close();
    }

    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    public static double highestGrade(ArrayList<Integer> grades){
        int max=grades.get(0);
        for (int grade : grades){
            if(grade>max){
                max=grade;
            }
        }
        return max;
    }
    public static double lowestGrade(ArrayList<Integer> grades){
        int min=grades.get(0);
        for (int grade : grades){
            if(grade<min){
                min=grade;
            }
        }
        return min;
    }

}
    


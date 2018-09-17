import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        float average = 0;
        float sum = 0;
        System.out.println();
        int[] grades = new int[numberOfStudents];
        for (int i=0;i<numberOfStudents;i++){
            System.out.printf("Enter the grade for student %d: ",i+1);
            grades[i] = input.nextInt();
            System.out.println();
        }
        int min = grades[0];
        int max = grades[0];
        for(int j=0;j<grades.length;j++){
            sum += grades[j];
        }
        average = sum/numberOfStudents;
        System.out.println("The average is " + average);
        for (int i=0;i<grades.length;i++){
            if(grades[i]>max){
                max = grades[i];
            }
        }
        for(int i=0;i<grades.length;i++){
            if(grades[i]<min){
                min = grades[i];
            }
        }
        System.out.println("The maximum is " + max);
        System.out.println("The minimum is " + min);
    }
}


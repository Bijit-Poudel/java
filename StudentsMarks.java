import java.util.Scanner;
public class StudentsMarks{
    public static void main(String[] args){

        Scanner object = new Scanner(System.in);
        String[] names = new String[3];
        int[][] marks = new int[3][3];
        for(int i = 0; i<3; i++){
            System.out.println("Enter student's name: ");
            names[i] = object.nextLine();
            
            for(int k = 0; k<3; k++){
                System.out.println("Enter marks for " + names[i]);
                marks[i][k] = object.nextInt();
            }
        }

    }
}
        
        

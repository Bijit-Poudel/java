import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        float numbers[] = new float[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            System.out.println("Enter number for index: "+ i);
            numbers[i] = input.nextInt();
        }
    }
}
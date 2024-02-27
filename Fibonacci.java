import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("How many Fibonacci you want to see??: ");
        int upto = object.nextInt();
        int loopCounter = 0;
        int i = 0;
        int j = 1;       

        while (loopCounter<upto){
            System.out.println(i);
            
            int sum = i + j;
            j = i;
            i = sum;
            loopCounter++;
            
        }
    } 
}
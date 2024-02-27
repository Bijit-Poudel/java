import java.util.Scanner;
public class FriendsName{
    public static void main(String[] args){
        String names = new String[5];
        Scanner object = new Scanner(System.in);
        for(int i = 1; i<=5; i++){
            System.out.println("Enter your frind's name:) : ");
            names[i-1] = object.nextLine();
        }
        for(int i=0; i<5; i++){
            System.out.println(names[0]);
        }
    }
}
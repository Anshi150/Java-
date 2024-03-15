import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*45);
        int userNumber = 0;

        do {
            System.out.println("Guess my number(1 - 45): ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("yupp .. correct number!!");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Number is too large");
            }
            else{
                System.out.println("Number is small");
            }
        } while (userNumber >= 0);
        System.out.println("My number was : ");
        System.out.println(myNumber);
    }
}
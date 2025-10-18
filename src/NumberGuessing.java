import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessing {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Random r = new Random();
        int min=1;
        int max=100;
        int attempts=0;
        int guessedNumber;
        int randomNumber = r.nextInt(min,max+1);
//        System.out.println(randomNumber);
        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n",min,max);
        do{
            System.out.println("Enter a Guess");
            guessedNumber=sc.nextInt();
            attempts++;
            if(guessedNumber<randomNumber){System.out.println("Too LOW");}
            else if(guessedNumber>randomNumber){System.out.println("Too High");}
            else{
                System.out.println("Number Matched! YOU WON");
                System.out.printf("Attempts Required %d",attempts);
            }
        }while(randomNumber!=guessedNumber);

        sc.close();
    }
}

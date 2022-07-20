
import java.util.Scanner;
import javax.swing.*;
public class guessnogame{
    public static void guessingnogame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("min no.");
        int min = sc.nextInt();
        System.out.println("max no.");
        int max = sc.nextInt();
        //System.out.println("200 300 no \n");
        int no = (int)(Math.random()*(max-min+1)+min);
        int tries = 5;
        int i;

        for(i = 0; i <= tries; i++ ){
            System.out.println("guess your no.: ");
            int guess = sc.nextInt();
            if(no < guess ){
                System.out.println("no. is less than "+ guess);

            }
            else if(no > guess ){
                System.out.println("no. is greater than "+ guess);
            }
            else if (guess == no){
                System.out.println("thats the correct");
                break;

            }
            if(i == tries ){
                System.out.println("machine exhausted");
                break;

            }



        }
    }
    
    public static void main(String[] args) {
        guessingnogame();
    }
}

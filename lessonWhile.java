import java.util.Scanner;
public class lessonWhile {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt(); // there's .nextint, .nextdouble and .next(for string).
            // we want to test if  n is between 1 and 10, if n is not between 1 and 10, then we ask the user to enter a number
            // int n = sc.nextInt(); is still same as int i = 5;. but in this case want the user to enter their number
            while(n<1|| n>10){
                System.out.println(n + " is not between 1 and 10. Try again: "); // will display when its false
                n = sc.nextInt(); //this help to kill the loop as a user. it will request for the user next entry 
            }
            System.out.println(n +" is between 1 and 10."); // will display when its right
        }
        
    }
}

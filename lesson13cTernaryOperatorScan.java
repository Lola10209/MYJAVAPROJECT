import java.util.Scanner;
public class lesson13cTernaryOperatorScan {
    public static void main(String[] args) {
        try (Scanner getnumber = new Scanner(System.in)) {
            System.out.println("Enter your choice number: ");
            int number = getnumber.nextInt();
            String output = (number % 2 == 0)?"Even number":"Odd number";
            System.out.println(output);
        }
    }
}

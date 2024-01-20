import java.util.Scanner;
public class lessonDoWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            do{
                System.out.println("Enter a number between 1 and 10: ");
                n = sc.nextInt();
            }while(n<1 || n>10);
            System.out.println(n + " is between 1 and 10");
        }
    }
}

import java.util.Scanner;
public class lesson12CIfElseLdder {
    public static void main(String[] args) {
        try (Scanner getmark = new Scanner(System.in)) {
            System.out.println("Enter the mark: ");
            double mark = getmark.nextDouble();
            if (mark < 50){
                System.out.println("Fail");
            }else if(mark >= 50  && mark < 60){
                System.out.println("C");
            }else if(mark >= 60 && mark < 70){
                System.out.println("B");
            }else if(mark >= 70 && mark < 80){
                System.out.println("A");
            }else if(mark >= 80 && mark < 100){
                System.out.println("A+");
            }else{
                System.out.println("Unknown Entry");
            }
        }
    }
}

// ------------------------------------------------


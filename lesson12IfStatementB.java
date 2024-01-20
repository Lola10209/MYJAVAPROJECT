import java.util.Scanner;
public class lesson12IfStatementB {
   public static void main(String[] args) {
    try (Scanner getyear = new Scanner(System.in)) {
        System.out.println("Enter your choice year: ");
        int year = getyear.nextInt();
        if((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0)){ //&& and "apasan" != "not equal to "
            System.out.println("Year: " + year + " is a Leap Year");
        }else{
            System.out.println("Year: "+ year + " is a Common Year");
        }
    }

   } 
}


// <= +> || == % + - / are alll used in a if statement
// they are different type of next; next and nextline for string
// nextInt for int, nextdouble for double or float convertion
// not when a function of && and || "or" takes place, you must bracket the and value. 
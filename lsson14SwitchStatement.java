import java.util.Scanner;
public class lsson14SwitchStatement {
    public static void main(String[] args) {
        try (Scanner getmonth = new Scanner(System.in)) {
            System.out.println("Enter your month: ");
            int month = getmonth.nextInt();
            String monthString = "";
            switch (month) {
                case 1:
                monthString = "1 - January";
                break;
                case 2:
                monthString = "2 - Febuaray";
                break;
                case 3:
                monthString = "3 - March";
                break;
                case 4:
                monthString = "4 - April";
                break;
                case 5:
                monthString = "5 - May";
                break;
                case 6:
                monthString = "6 - June";
                break;
                case 7:
                monthString = "7 - July";
                break;
                case 8:
                monthString = "8 - August";
                break;
                case 9:
                monthString = "9 - September";
                break;
                case 10:
                monthString = "10 - October";
                break;
                case 11:
                monthString = "11 - November";
                break;
                case 12:
                monthString = "12 - December";
                break;
                default:
                System.out.println("Invalid month!");
            }
            System.out.println(monthString);
        }
        
    }
}

// create a vowel type of case (a, e, i, o, u)
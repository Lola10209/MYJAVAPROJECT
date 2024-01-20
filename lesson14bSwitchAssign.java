import java.util.Scanner;
public class lesson14bSwitchAssign {
    public static void main(String[] args) {
        try (Scanner getsound = new Scanner(System.in)) {
            System.out.println("Enter your Vowel Sound: ");
            char sound = getsound.next().charAt(0); //This is for conversion in character from string
            String vowelString = "";
            switch (sound) {
                case 'A':
                vowelString  = "A is a vowel sound";
                break;
                case 'E':
                vowelString = "E is a vowel sound";
                break;
                case 'I':
                vowelString = "I is a vowel sound";
                break;
                case 'O':
                vowelString = "O is a vowel sound";
                break;
                case 'U':
                vowelString = "U is a vowel sound";
                break;
                default:
                System.out.println("It is not a vowel sound");
            }
            System.out.println(vowelString);
        }
    }
}


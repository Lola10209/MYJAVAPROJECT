// import java.awt.BorderLayout;
// import java.awt.GridLayout;
// import java.awt.event.ActionEvent;
// import java.util.ArrayList;
// import java.util.Random;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.SwingUtilities;



// public class lessonAssign {

//     public static void main(String[] args) {
//         int tries = 0;

//         boolean iterated = false;
//         String temp = "";
//         String holder = "";

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your secret word:");
//         String word = (String) Scanner.nextInt.toString();

//         do {
//             System.out.println("Enter your letter guess");
//             String guess = Scanner.nextDouble.toString();

//             for(int i = 0; i < word.length(); i ++) {
//                 if (guess.equals(Character.toString(word.charAt(i)))) {
//                     if(!iterated)
//                         temp += Character.toString(word.charAt(i));
//                     else {
//                         holder = Character.toString(temp.charAt(i)).replace("-", guess);
//                         temp = temp.substring(0, i) + holder + temp.substring( i + 1, temp.length());
//                     }
//                 } else {
//                     if(!iterated) {
//                         temp += "-";
//                     }
//                 }
//             }
//             tries++;
//             iterated = true;
//             System.out.println(temp);
//             if(temp.equals(word)) {
//                 System.out.println("You guessed correctly!");
//                 break;
//             }
//         }while (tries < 10);

//     }
// }





// import java.util.Scanner;

//   public class lessonAssign{
//     public static void main(Class<String[]> class1){
//       Scanner getWord = new Scanner(System.in);
//       char words = getWord.next().charAt(0);
      
//     }
    
//     private final static String[] words = { "Adventure", "Hungary", "Pizza", "Madrid", "Flower",
//             "Chicken", "Israel", "Romania", "Denmark", "Australia" };
//             private final Random rand = new Random();
//             public String getRandomWord() {
//                 return words[rand.nextInt(words.length)];
//             }

//     public static void printInstruction(){
//       System.out.println(" I am thinking of a number between 1 and 100."); 
//       System.out.println(" Can you guess what it is? ");
//       System.out.println(" Type a number : ");
//     }
    
//     public static void guessNum(int number, int guess){
//       if (number == guess){
//         System.out.println("Congratulations! You got it right.");
//       }
//       else if(number > guess){
//         System.out.println("Your guess is too low.");
//         Scanner in = new Scanner(System.in);
//         guess = in.nextInt();   
//         System.out.println("Your guess is: "+guess);
//         guessNum(number, guess);
//       } 
//       else{
//         System.out.println( "Your guess is too high.");
//         Scanner in = new Scanner(System.in);
//         guess = in.nextInt();   
//         System.out.println("Your guess is: "+guess);
//         guessNum(number, guess);
//    }
//    }
//     public static void numberOfTries(int guessNum){
//       Random random = new Random();
//       char word = random.next().charAt(0);
//       for(int i = 0; i < 3; i++){
//         System.out.println("Out of guesses!");
//         System.out.println("The word was " + word);
//       }
//     }
//  

// import java.util.ArrayList;
// import java.util.Random;

// public class lessonAssign {
//     public static void main(String[] args) {
//         String secretWord = getRandomWordWords();
//         int tries=3; 
//         String guessWord = getWord();
//         while(guessWord!=secretWord && tries>0){ 

//             if(guessWord==secretWord) break; 
//             tries--; 
//         } 
//         if(tries>0){
//             System.out.println("You won! The word was "+secretWord+"."); 
//         }else{
//             System.out.println("You lost! The word was "+secretWord+"."); 
//         }
//     }


//     private static String getWord() {
//         return null;
//     }

    
//     private static String getRandomWordWords(){
//         System.out.println("Enter a word: ");
//         String words = "Adventure";
//             ArrayList<String> list = new ArrayList<String>();
//             int n = words.length();
//             Random rand = new Random();
//             for (int i = 0; i < 3; i++){
//                 char a = words.charAt(rand.nextInt(n));
//                 String s = Character.toString(a); 
//                 if(list.indexOf(s) == -1){
//                     list.add(s);
//                 }
//             }
//             System.out.println(list);
        
//         System.out.println(words);
//         return words;
//     }
// }


// public class lessonAssign {
//     public static void main(String[] args) {
//         String word = "hello";
//         StringBuilder gameWord = new StringBuilder("h-l-o");
//         Scanner sc = new Scanner(System.in);

//         while (true){
//             int think = gameWord.indexOf("-");
//             if (think == -1)
//                 break;

//             System.out.println("guess the letter " + gameWord + " : ");
//             char c = sc.nextLine().charAt(0);
//             if (c == word.charAt(think)){
//                 gameWord.replace(think,think+1, word.substring(think,think+1));
//                 System.out.println("correct guess, you won! " + gameWord);
//             }
//             else {
//                 System.out.println("incorrect, try again");
//             }
//         }
//     }
// }

import java.util.Scanner;
public class lessonAssign {
    public static void main(String[] args) {
        String word = "Adventure";
        StringBuilder secretWord = new StringBuilder("Ad-e-tu-e");
        Scanner sc = new Scanner(System.in);

        while (true){
            int think = secretWord.indexOf("-");
            if (think == -1)
                break;

            System.out.println("guess the letter " + secretWord + " : ");
            char c = sc.nextLine().charAt(0);
            if (c == word.charAt(think)){
                secretWord.replace(think,think+1, word.substring(think,think+1));
                System.out.println("correct guess, you won! " + secretWord);
            }
            else {
                System.out.println("incorrect, try again");
            }
        }
    }
}
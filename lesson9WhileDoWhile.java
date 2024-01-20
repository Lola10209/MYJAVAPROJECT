public class lesson9WhileDoWhile {  //these includes looping.(repetition)
    public static void main(String[] args) {
        //While loop: it's check the condition before execute
        int i = 1;
        while (i<=5) {
            System.out.println("Hello System College" + i);
            i++;  //these help to kill the continous loop
        } //n.b; looping gets to loop only inside the main. //"5 iteration"

        // e.g2 while loop
        int x = 100;
        while (x<=5){
            System.out.println("Hello College" + x);
            x++; //"0 iteration"
        } //n.b the condition will skip/evaluate false in it's output because 100 is not less than or equal to 5

        // Do While loop: this execute before checking the condition; it will run atleast once before checking the condition
        int y = 1;
        do{
            System.out.println("Hello System Business" + y);
            y++; //++; helps to increment(iterate/iteration)
        }while(y<=3); //"3 iteration"

        // e.g2  Do While loop
        int j = 100;
        do{
            System.out.println("Hello Business");
            j++;
        }while(j<=5); // n.b; it will run atleast once before checking the condition(while loop)"1 iteration"
    }
    
}

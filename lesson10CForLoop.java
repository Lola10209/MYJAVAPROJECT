public class lesson10CForLoop {
    public static void main(String [] args){
        int [] numbers = {10,20,30,40,50}; // [] the numbers in the square bracket is an array
        for(int x:numbers){
            System.out.println(x);
        }

            //example 2 using a if statement
        int [] number = {10,20,30,40,50}; // [] the numbers in the square bracket is an array
        for(int x:number){
            if(x==30){
                break; // its breaks out the value selected ==30 and also break the rest of its decreasing value
            }
            System.out.println(x);
            System.out.print("\n");
        }
        
            //example 3 using a continue
        int [] num = {10,20,30,40,50}; // [] the numbers in the square bracket is an array
        for(int x:num){
            if(x==30){
                continue;  //its breaks out the value selected ==30 and continue rest of its decreasing value
            }
            System.out.println(x);
            System.out.print("\n");
        }       
    }
}

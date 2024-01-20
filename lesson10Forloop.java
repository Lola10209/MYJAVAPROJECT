public class lesson10Forloop {
    public static void main(String [] args){
        for (int i = 1; i <= 5; i++) { //i < args.length; is same as the while(i<=5), depend on the loop you want
            System.out.println("Hello System College for i loop " + i);
        }
        int a;  //varaible can be written outside before looping
        for(a=1; a<=5; a++){
            System.out.println("Hello Business School for a loop " + a);  
        }
        System.out.println("Checking if couter get to 6 before breaking " + a);

        //iterate(increment by 1 (age=age+1) or age++;)
        int age;
        for(age = 10; age<=26; age++){
            System.out.println("mary turns: " + age);
        }
        System.out.print("\n");

        //iterate(increment by 2 (age=age+2))
        int sage;
        for(sage = 10; sage<=26; sage = sage+2){
            System.out.println("sage turns: " + sage);
        }
    } //for loop means for 1 is equal 1 and less than 5; output 1
        //for loop means for 2 is equal 1 and less than 5; output 2
        //for loop means for 3 is equal 1 and less than 5; output 3
        //for loop means for 4 is equal 1 and less than 5; output 4
        //for loop means for 5 is equal 1 and less than 5; output 5
        //for loop means for 6 is equal 1 and less than 5; output false then kill the loop
        
}

// to increment by 2(adding by 2); i.e; age=age+2; to increment by 2
// x=x+1 to increment by 1
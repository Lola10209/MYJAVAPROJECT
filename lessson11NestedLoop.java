public class lessson11NestedLoop {  //Nested loop for For loop
    public static void main(String [] args){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(i + "" + j);
            }
        }
        System.out.println();

//==========================================================================================================
        // example 2
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.println(i + "x" + j + "=" +(i*j));
            }
        }
        System.out.println();

//==============================================Example 3=====================================================
        for(int a=1; a<=5; a++){
            for(int b=1; b<=a; b++){ //where a = 1, b cannot go more than the a value; 
                System.out.println(a+" "+b);
            }
            System.out.println();

        }

// ==============================================example 4=======================================================================
        for(int a=1; a<=5; a++){
            for(int b=1; b<=a; b++){ //where a = 1, b cannot go more than the a value; 
                System.out.print("*");
            }
            System.out.println();

        }

//===================================================Example 5==============================================
         for(int a=1; a<=5; a++){
            for(int b=1; b<=a; b++){ //where a = 1, b cannot go more than the a value; 
                System.out.print(a+ " " +b);
            }
            System.out.println();
        }

        
//===================================================Example 5==============================================
         for(int y=1; y<=10; y++){
            for(int z=1; z<=10; z++){ //muplication table 
                System.out.println((y * z)+ " ");
            }
            System.out.println();
        }

//============================assignment====================================================================
        //multiplication table to see the right multiplication
        for(int y=1; y<=10; y++){
            for(int z=1; z<=10; z++){ //muplication table 
                System.out.println(y + "x" + z + "=" + (y*z));
            }
            System.out.println("End of Multiplication Table");
        }
    }
}
// note the outer will run one time then the inner loop will iterate three times the the outer loop will iterate again until its loop is complete


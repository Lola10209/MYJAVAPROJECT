public class lesson4Variable {
    public static void main (String[] args) {
        System.out.println("");

        /*string: they are text of "hello", they are surrounded by double quote
        * int: whole number  stores -123 or 123
        * float: they are decimals that stores -19.9 or 19.9
        * char: they store single character such as 'a' or 'b'. surrounded by single quote
        * boulean: stores true or false*/

        /*Declaring variable. eg*/
        String Firstname = "Tony";
        String Surname = "Ononogbo";
        System.out.println(Firstname);
        System.out.println(Surname);
        
        /*int examples */
        int Age = 27;
        System.out.println(Age);

        int Score;
        Score = 56;
        System.out.println(Score);

        int Passenger = 300;
        Passenger = 299;
        System.out.println(Passenger);

        final int result = 60;
        // result = 59; its was commented out because theres a final result assigned to it
        System.out.println(result);


    /*i Float examples   /*note, float digit cannot calculate on its own without adding an f to the digit */
        float salary = 17.9f;
        System.out.println(salary);
// note; a float keyword can store from 3.4e-038 to 3.4e+038. e means exponetial (raise to power)
        
    /*ii Doubles Examples */
        double wages = 17.9;
        System.out.println(wages);

    /*character Examples */
        char john_grade = 'A';
        char tony_grade = 'B';
        char smith_grade = 'a';
        char josh_grade = 'b';
        System.out.println(john_grade);
        System.out.println(tony_grade);
        System.out.println(smith_grade);
        System.out.println(josh_grade);
    // note A or B is referenced in departmental or grading system.
        char grade_A = 'A';
        char grade_B = 'B';
        char grade_C = 'C';
        System.out.println(grade_A);
        System.out.println(grade_B);
        System.out.println(grade_C);
    // note a number cannot be assigned to a character
        // char grade_A = "65";
        // System.out.println(grade_A);

        /*converted to ascii. american standard for information for code interface/ */
        int myGrade = 65;
        char my_grade = (char)myGrade;
        System.out.println(my_grade);
        System.out.println(myGrade);

    }
}

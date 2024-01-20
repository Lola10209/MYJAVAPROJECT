public class lesson13bTernaryOperator {
    public static void main(String[] args) { // ternary operator is same as if else statement but code is diplayed on a single line
        int number = 10;
        String output = (number % 2 == 0)? "Even number": "Odd number";
        System.out.println(output);
// string output also means "if(){}"
// ? means 'then'
// : means 'else'
    }
}

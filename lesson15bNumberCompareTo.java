public class lesson15bNumberCompareTo {
    public static void main(String[] args) {
        Integer x = 5;
        //if integer value x(5) is greater than the arguement(3) then output will be 1
        System.out.println(x.compareTo(3)); //(x.compareTo(3)); is a compare method of an integer class
        // if integer value x(5) is equal to the arguement(5) then output will be 0
        System.out.println(x.compareTo(5));
        // if integer value x(5) is less than the arguement(6), then output will be -1
        System.out.println(x.compareTo(6));
    }
}

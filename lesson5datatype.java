public class lesson5datatype {
    public static void main (String[] args){
        int age = 27;
        float fxrate = 5.76f;
        double currency = 799.9;
        char mychar = 'A';
        boolean mybool = true;
        String Firstname = "Mary";
        byte rooms = 87;
        long min = -9223372036854775808l;
        long max = 9223372036854775807l;
        short mysize = 17500;
        long mylong = 10;

        System.out.println("int age: " + age);
        System.out.println("float fxrate: " + fxrate);
        System.out.println("double currency: " + currency);
        System.out.println("char mychar: " + mychar);
        System.out.println("boolean mybool: " + mybool);
        System.out.println("String Firstname: " + Firstname);
        System.out.println("byte rooms: " + rooms);
        System.out.println("long min: " + min);
        System.out.println("long max: " + max);
        System.out.println("short mysize: " + mysize);
        System.out.println("long mylong: " + mylong);
    }
}
// there are two type of datatype
/* primitive; it's include the int--(int(4bytes; -2,147,483,647 to 2,147,483,647), 
                long(8bytes; -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808), 
                byte(1byte; -128 to 127), 
                short(2bytes;-32768 to 32767)), 
                
        !! float--(float(4bytes; 'stores fraction from 6 to 7 decimal digits'), 
                        double(8bytes; 'stores fraction from 15 to 45 decimal digits))
        !!!  boolean--(1byte; stores true or false)
        !v    char--(2bytes; stores character letters) */

/* Non-Primitive; its include string, arrays, class, object, interface, constructor, global variable etc*/
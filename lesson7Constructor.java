public class lesson7Constructor {
    public static void main (String [] args){
        // see the constructor in lesson7dateconstructor.java
    lesson7Date birthday = new lesson7Date(11, 8, 1960);
    lesson7Date anniversary = new lesson7Date(31, 8, 2013);
    
    birthday.setMonth(11);
    System.out.println(birthday.toString());

    anniversary.setMonth(5);
    System.out.println(anniversary.toString());
    }
}

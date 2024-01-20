public class lesson15eNumberOther {
    public static void main(String[] args) {
        //Minimum(min)
        System.out.println(Math.min(120.33, 120.34));

        double a = 23.4;
        double b = 32.5;
        System.out.println(Math.min(a, b));

        //Maximum(max)
        System.out.println(Math.max(120.33, 120.34));

        int x = 15;
        int y = 16;
        System.out.println(Math.max(x, y));

        //Round
        double Price = 100.675;
        double Qty = 100.400;
        float Prices = 100.455f;
        float Qties = 90f;
        System.out.println(Math.round(Price));
        System.out.println(Math.round(Prices));
        System.out.println(Math.round(Qty));
        System.out.println(Math.round(Qties));

        double mynum = Math.round(45.45);
        System.out.println(mynum);
        double Qtys = Math.round(100.400);
        System.out.println(Qtys);
        double Pricee = Math.round(100.675);
        System.out.println(Pricee);


    }
}

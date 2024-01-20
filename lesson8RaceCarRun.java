public class lesson8RaceCarRun {
    public static void main (String [] args){
        int maxSpeed = lesson8RaceCar.getmaxSpeedForAll();
        lesson8RaceCar altima = new lesson8RaceCar(60, "Nissan Altima");
        altima.setSpeed(100); //speed is rset to 100
        //altima.getmaxSpeedForAll();  this a static method, in java; you can access method from the name of an object

        // while(altima.getSpeed() < maxSpeed){
        //     System.out.println(altima);
        //     altima.getSpeed() ++;
        // }
        int x = altima.getSpeed();
        while(x <= maxSpeed){
            System.out.println("The Race Car is now at speed: "+ x + "km/hr");
            x++;  //++ helps to break the loop. helps to increment by adding one till final stop
                        //while helps to carry out a condition. <= helps to run till 120
                        // < helps to run till 119km/hr
        }
    }
}


// assignment;
// class, result and maxresult

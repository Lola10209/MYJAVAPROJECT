public class lesson8RaceCar {
    private int Speed;   //dynamic instance variable
    private String name;   //dynamic instance variable
    private static int maxSpeedForAll = 120; //fixed/static instance variable
    // these are instance variable.
    public lesson8RaceCar(int Speed, String name){    //constructor.  it is a constructor in it's main class
        setSpeed(Speed);
        setname(name);
    }
    public static int getmaxSpeedForAll(){  //getter (assesor), static method
        return maxSpeedForAll;
    }
    public static void setmaxSpeedForAll(int maxSpeedForAll){ //setter, nb; void doesn't return (mutator;change)
        lesson8RaceCar.maxSpeedForAll = maxSpeedForAll;
        //n.b; (int maxspeedforall)- it is a local variable
        // lesson8RaceCar.maxSpeedForAll- it is a global variable because its method its static so its called with the class/parent;lesson8carrace
        // n.b; this.maxSpeedForAll happen when the instance variable its n a dynamic state
    }
    public int getSpeed(){
        return Speed;
    }
    public void setSpeed(int Speed){
        if (Speed <= maxSpeedForAll){  //setSpeed is a dynamic method but maxSpeedForAll is static method. we can use a static method in a dynamic method
            this.Speed = Speed;
        }else{
            this.Speed = maxSpeedForAll;
        }
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String toString(){
        return "RaceCar[name," + name + ", speed = "+ Speed + "]";
    }
}

public class lesson6cCar {
    int car_make;
    public lesson6cCar(String name){   // this constructor has one parameter called "name".
        System.out.println("The name is:" + name);
    }
    public void setMake(int make){
        car_make = make;
    }
    public int getMake(){
        System.out.println("The car make is: " + car_make);
        return car_make;
    }
    public static void main(String[] args){
        //create the object
        lesson6cCar mycar = new lesson6cCar("Nissan Altiana");
        // call the class method to set make
        mycar.setMake(2000);
        // call with method to get the make of car //to call a class with a method "."
        mycar.getMake();
        System.out.println("The Variable from the object is: "+ mycar.car_make);
        System.out.println(mycar.getMake());
    }
}

//constructor as a topic. this is a constructor.
// they are three step in declaring a constructor
//-- declaraction; a variable declaraction with a variable name and type
//-- instantiation; the 'new' keyword is used to create the object
//--initialization; the "new" keyword is followed by a call to a constructor. this "call" initializes the "new" object

//object reference = new constuctor  //note, first create the object
// constructor bares the name of its parent, i.e; public lessonccar().

// you can return a void
// 
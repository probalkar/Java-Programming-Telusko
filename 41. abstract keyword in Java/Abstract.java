// an abstract class can have combination of both abstract and non abstract classes
// an abstract method must be inside an abstract class only
abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Playing music...");
    }
}

// an abstract subclass does not have the compulsion of defining all the abstract methods of the super classes
abstract class WagonR extends Car{
    @Override
    public void drive(){
        System.out.println("Driving...");
    }
}

// a class that is not abstract is called concrete class and must define all the abstract methods of the super classes
class WagonRFaceLift extends WagonR{
    @Override
    public void fly(){
        System.out.println("Flying...");
    }
}

public class Abstract{
    public static void main(String[] args) {
        // Car car = new Car();    // cannot create object of an abstract class
        // Car car = new WagonR();     // cannot create object of an abstract subclass as well
        Car car = new WagonRFaceLift();     // can create object of concrete subclass referring to abstract class variable
        car.drive();
        car.playMusic();
        car.fly();
    }
}
package inputFile.src;

abstract class CarFeatures{
    public void accelerate(){
        System.out.println("Accelerate");
    }
    public void applyBreaks(){
        System.out.println("Breaking");
    }
    public abstract void changeGear();
}

public class Car {

}

import java.util.Random; // used to generate random numbers

public class Smartphone extends Devise { //subclass of Devise class
    private double cameraResolution;
    //I dont create variable model beacuse I can access it from main class Devise
    public Smartphone(String type, Random random, String model, double cameraResolution) {
        super(type, random.nextDouble() * 100000, random.nextDouble() * 0.5); //random.nextDouble() * 100000 used to generate random numbers from 0 to 100000 for price, double type and 0 to 0.5 for weight
        this.model = model;
        this.cameraResolution = cameraResolution;
    }


    //create getters to retrieve the value of the variables and setter to update or set the value of the data of the variables.
    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
}

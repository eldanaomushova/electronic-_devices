import java.util.Random; // used to generate random numbers

public class Laptop extends Devise{ //subclass of Devise class
    private double version;

    public Laptop(String type, Random random, String model, double version) {
        super(type, random.nextDouble() * 200000, random.nextDouble() * 2.0);//random.nextDouble() * 200000 used to generate random numbers from 0 to 200000 for price, double type and 0 to 2.0 for weight
        this.model = model;
        this.version = version;
    }
    //create getters to retrieve the value of the variables and setter to update or set the value of the data of the variables.
    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}

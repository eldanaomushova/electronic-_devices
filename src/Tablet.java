import java.util.Random;

public class Tablet extends Devise{
    private double version;

    public Tablet(String type, Random random, String model, double version) {
        super(type, random.nextDouble() * 90000, random.nextDouble() * 0.9); //random.nextDouble() * 90000 used to generate random numbers from 0 to 90000 for price, double type and 0 to 0.9 for weight
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

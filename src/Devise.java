public class Devise {
    private String type;
    protected String model; // create protected value to access it in the same subclasses.
    private double price;
    private double weight;

    public Devise(String type, double price, double weight) { // creating constructor of 3 private variables to initialize the object
        this.type = type; //this refers to the current object
        this.price = price;
        this.weight = weight;
    }
    //create getters to retrieve the value of the variables and setter to update or set the value of the data of the variables.
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

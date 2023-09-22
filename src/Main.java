import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter how many devises you want: ");
        Scanner scanner = new Scanner (System. in); //create Scanner object to get value from user
        Random random = new Random() ; //create Random object for randoming numbers
        DecimalFormat decimalFormat = new DecimalFormat("#." + "0".repeat(2)); //DecimalFormat to control the number of digits after the decimal point, pattern is showing how much digits will be after comma.
        //Giving value to 3 subclasses by creating objects
        //random is written, because we random numbers for price and weight
        Smartphone smartphone = new Smartphone("Smartphone", random, "Iphone 10", 75.0);
        Laptop laptop = new Laptop("Laptop", random, "Mac air 13", 3.0);
        Tablet tablet = new Tablet("Tablet", random, "Ipad mini", 2.5);

        int quantity = scanner.nextInt(); //create quantity and take it's value from user using nextInt
        int quantitySmartphone = 0;
        int quantityLaptop = 0;
        int quantityTablet = 0;
        if(quantity>=1 && quantity<=20){ //used to random quantity for smartphone, tablet and laptop
            quantitySmartphone = random.nextInt(quantity); //first, random for smartphone and ...
            quantity-=quantitySmartphone; // ... and subtract from quantity
            quantityLaptop = random.nextInt(quantity); //then, random for laptop
            quantity-=quantityLaptop; // and subtract from quantity
            quantityTablet = quantity; // rest we are giving to tablet
        }

        //finding price and weigth by multiplying to it's quantity and adding to other gadgets
        double totalPrice = (quantitySmartphone*smartphone.getPrice()) + (quantityLaptop*laptop.getPrice()) + (quantityTablet*tablet.getPrice());
        double totalWeight = (quantitySmartphone*smartphone.getWeight()) + (quantityLaptop*laptop.getWeight()) + (quantityTablet*tablet.getWeight());


        System.out.println("The number of Smartphones: " + quantitySmartphone);
        System.out.println("The number of Laptops: " + quantityLaptop);
        System.out.println("The number of Tablets: " + quantityTablet);
        System.out.println("The price of Smartphone: " + decimalFormat.format(smartphone.getPrice()) + "\nThe price of laptop: " + decimalFormat.format(laptop.getPrice()) + "\nThe price of tablet: " + decimalFormat.format(tablet.getPrice()));
        System.out.println("Total price of all devises: " + decimalFormat.format(totalPrice) + " soms.");
        System.out.println("Total weight of all devises: " + decimalFormat.format(totalWeight) + " kilos."); //decimalFormat.format() variable to control the number of decimal places you want in the formatted output.
    }
}
import java.time.Year;

public class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private double price;
    private double tax;

    int currentYear = Year.now().getValue();

    public Car() {
        this.brand = "VW";
        this.model = "Golf";
        this.yearOfProduction = 2003;
        this.price = 5000;
    }

    public Car(String theBrand, String theModel, int theYearOfProduction, double thePrice) {
        this.brand = theBrand;
        this.model = theModel;
        this.yearOfProduction = theYearOfProduction;
        this.price = thePrice;
    }

    public int calculateAge() {
        return currentYear - yearOfProduction;
    }

    public double calculateTax() {
        if (currentYear - yearOfProduction >= 5) {
            tax = price * 0.05;
            return tax;
        } else {
            return tax = 0;
        }
    }

}

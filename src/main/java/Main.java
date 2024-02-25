import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car();
        Car secondCar = new Car("BMW", "E60", 2008, 7500);
        Car thirdCar = new Car("Tesla", "Cybertruck", 2022, 200000);

        System.out.println(firstCar.calculateAge());
        System.out.println(secondCar.calculateAge());

        System.out.println(firstCar.calculateTax());
        System.out.println(secondCar.calculateTax());
        System.out.println(thirdCar.calculateTax());
    }
}

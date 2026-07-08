import models.Bike;
import models.Car;
import models.Truck;
import models.Vehicle;

public class Main {
    public static void main(String[] args) {
        
        Vehicle car1 = new Vehicle("MH16KP4557", "Suzuki",4560);
        car1.displayInfo();

        car1.rentout();
        car1.rentout();
        
        car1.returnVehicle();
        car1.rentout();

        System.out.println("Rate per day : " + car1.getRatePerDay()) ;

        car1.setRatePerDay(4000);
        car1.setRatePerDay(-500);

        System.out.println("rate per day " + car1.getRatePerDay());

        Car c1 = new Car("MH09YU3426", "Hyundai", 2000, 4);
        c1.displayInfo();

        Bike b1 = new Bike("HR06ER3456","kia", 350);
        b1.displayInfo();

        Truck t1 = new Truck("PN89RT5678", "Ashok Leyland", 7000, 10000);
        t1.displayInfo();
    }
}

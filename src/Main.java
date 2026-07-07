public class Main {
    public static void main(String[] args) {
        
        Vehicle car1 = new Vehicle("MH16KP4557", "Suzuki",4560);
        car1.displayInfo();

        Vehicle bike1 = new Vehicle("MH09SD2415","Hero",670);
        bike1.displayInfo();

        double total = car1.calculateTotalRent(6);
        System.out.println("total rent for 5 days : " + total);
    }
}

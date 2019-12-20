public class Main {

    public static void main(String[] args) {
        Limousine limo = new Limousine("12A12A", 5);
        Driver driver = new Driver("Korovessis");
        RentalCarAgency store = new RentalCarAgency(limo, driver);
        System.out.println(limo);
        System.out.println(driver);

        Limousine limo1 = new Limousine("A1212A", 5);
        Driver driver1 = new Driver("RE-Jim");
        limo1.drives(driver1);
        limo1.makeAvailable();
    }
}

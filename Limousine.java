public class Limousine extends Car{
    private int maxPassengers;
    private Driver driver;

    public Limousine(String plate, int maxPassengers) {
        super(plate);
        this.maxPassengers = maxPassengers;
        driver = null;
    }

    public int getPassengers() {
        return maxPassengers;
    }

    public void setPassengers(int passengers) {
        this.maxPassengers = passengers;
    }
    public void drives(Driver driver){
        this.driver = driver;
    }
    public void makeAvailable(){
        this.driver = null;
    }

    @Override
    public String toString() {
        return "Limousine{" +
                "maxPassengers=" + maxPassengers +
                ", driver=" + driver +
                "} " + super.toString();
    }
}

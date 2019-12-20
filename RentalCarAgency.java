public class RentalCarAgency {
    private Limousine limousine;
    private Driver driver;

    public RentalCarAgency(Limousine limousine, Driver driver) {
        this.limousine = limousine;
        this.driver = driver;
    }

    public Limousine getLimousine() {
        return limousine;
    }

    public void setLimousine(Limousine limousine) {
        this.limousine = limousine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "RentalCarAgency{" +
                "limousine=" + limousine +
                ", driver=" + driver +
                '}';
    }
}

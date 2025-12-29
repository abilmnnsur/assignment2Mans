public class racingcar extends car {

    private int horsepower;

    public racingcar(String brand, int year, int doors, String fuelType, int horsepower) {
        super(brand, year, doors, fuelType);
        this.horsepower = horsepower;
    }

    @Override
    public void StartEngine() {
        System.out.println("racing car engine started");
    }

    public void horseeeee() {
        System.out.println("power of racing car is : " + horsepower + "   horses");
    }
}
public class truck extends vehicle {

    private double capacity;
    private int numAxles;

    public truck(String brand,int year, double capacity, int numAxles) {
        super(year,brand);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }
    @Override
    public void StartEngine(){
        System.out.println("Truck engine started");
    }
    @Override
    public void StopEngine(){
        System.out.println("Truck engine stopped");
    }
}
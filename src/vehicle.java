public abstract class vehicle {
    protected int year;
    protected String brand;
    public vehicle(int year,String brand){
        this.year=year;
        this.brand=brand;
    }
    public void StartEngine(){
        System.out.println("qyzduRRRR");
    }
    public void StopEngine(){
        System.out.println("oshiRRRR");
    }
    public void DisplayInfo(){
        System.out.println("brand: " + brand);
        System.out.println("year: " + year);
    }
    protected Driver driver;
    public void setDriver(Driver driver){
        this.driver=driver;
    }
    public void displayDriverInfo() {
        if (driver != null) {
            driver.displayDriverInfo();
        } else {
            System.out.println("No driver assigned.");
        }
    }
}

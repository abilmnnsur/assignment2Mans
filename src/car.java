class car extends vehicle {
    private int doors;
    private String fuelType;
    public car(String brand, int year,int doors,String fuelType){
        super(year, brand);
        this.doors=doors;
        this.fuelType=fuelType;
    }
    @Override
    public void StartEngine(){
        System.out.println("Car engine started");
    }
    @Override
    public void StopEngine(){
        System.out.println("Car engine stopped");
    }
}

 class motorcycle extends vehicle {

    protected boolean hasSidecar;

    public motorcycle(String brand, int year, boolean hasSidecar) {
        super(year, brand);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void StartEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    public void StopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}
public class Main{
    public static void main(String[] args){
        Driver birinshidriver= new Driver("Abilka","F1");
        Driver ekinshidriver= new Driver("Abylaika","F2");
        Driver ushinshidriver= new Driver("Alizhka","F3");
        Driver tortinshidriver= new Driver("Ulanka","F4");
        Driver besinshidriver= new Driver("Sayanka", "F5");
        vehicle car=new car("M5 competition",2025,4,"petrol");
        vehicle motorcycle=new motorcycle("Neiman Marcus",2024,false);
        vehicle truck=new truck("Mercedes",2025,5.8,6);
        racingcar ferrari = new racingcar("Ferrari", 2024, 2, "petrol", 800);
        racingcar mclaren = new racingcar("McLaren", 2025, 2, "petrol", 1000);
        racingcar mercedes = new racingcar("Mercedes", 2024, 2, "petrol", 900);
        car.setDriver(birinshidriver);
        motorcycle.setDriver(ekinshidriver); // агрегация
        truck.setDriver(tortinshidriver);

        vehicle[] vehicles = { car, motorcycle, truck,};

        for (vehicle v : vehicles) {
            v.StartEngine();
            v.DisplayInfo();
            v.displayDriverInfo();
            v.StopEngine();
            System.out.println();
            }
        }

    }


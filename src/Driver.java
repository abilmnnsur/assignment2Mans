public class Driver {
    private String name;
    private String licenseNum;
    public Driver(String name, String licenseNum){
        this.name=name;
        this.licenseNum=licenseNum;
    }
    public void displayDriverInfo(){
        System.out.println("Driver: " + name +   " || license:"+ licenseNum);
    }
    }


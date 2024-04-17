public class Driver extends Person{
    private int AFM;
    private String licensePlate;
    private boolean deliversToLockers;
    private boolean deliversToHome;
    public Driver(){

    }
    public Driver(String firstName, String lastName, String address, String email, int AFM, String licensePlate, boolean deliversToLockers, boolean deliversToHome){
        super(firstName, lastName, address, email);
        this.AFM = AFM;
        this.licensePlate = licensePlate;
        this.deliversToLockers = deliversToLockers;
        this.deliversToHome = deliversToHome;
    }
    public void setAFM(int AFM){
        this.AFM = AFM;
    }
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    public void setDeliversToLockers(boolean deliversToLockers){
        this.deliversToLockers = deliversToLockers;
    }
    public void setDeliversToHome(boolean deliversToHome){
        this.deliversToHome = deliversToHome;
    }
    public int getAFM(){
        return AFM;
    }
    public String getLicensePlate(){
        return licensePlate;
    }
    public boolean getDeliversToLockers(){
        return deliversToLockers;
    }
    public boolean getDeliversToHome(){
        return deliversToHome;
    }

}



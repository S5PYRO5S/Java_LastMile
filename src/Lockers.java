public class Lockers {
    private int lockers;
    private boolean isFull;

    public Lockers(){
        this.isFull = false;
    }
    public Lockers(int lockers){
        this.lockers = lockers;
        this.isFull = false;
    }
    public void setLockers(int lockers){
        this.lockers = lockers;
    }
    public void setIsFull(boolean isFull){
        this.isFull = isFull;
    }
    public int getLockers(){
        return lockers;
    }

}

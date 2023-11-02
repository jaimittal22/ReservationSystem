public class Reservation {
    //this will help me make reservation objects
    public int numPeople;
    public double time;
    public long priority;
    long timeMade;
    //helpful for finding current time
    //System.currentTimeMillis

    public Reservation(int pnumPeople, double ptime, long ptimeMade, long ppriority){
            numPeople = pnumPeople;
            time = ptime;
            timeMade = ptimeMade;
            priority = ppriority;
    }

    public void print(){
        System.out.println("Reservation for " + numPeople + " people at "+ time+ " made at "+ timeMade + " with priority "+ priority);
    }

}


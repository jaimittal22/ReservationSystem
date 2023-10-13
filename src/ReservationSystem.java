public class ReservationSystem {

    public static void main(String[] args) {
        ReservationSystem jarvis = new ReservationSystem();
    }

    Reservation [] reservations = new Reservation[10];
    public ReservationSystem(){
       // Reservation gavin = new Reservation(4, 2.00, 1000, 1);
        //gavin.print();

    //    Reservation dog = new Reservation(4, 8, 645, 1);
    //    dog.print();


    //    reservations[0] = gavin;
    //    reservations[1] = dog;
    //    reservations[1].print();
     //   reservations[2] = new Reservation(3, 9.00, 4000, 4);
    //    reservations[2].print();
    //    for(int x = 3; x < 10; x++){
     //       reservations[x] = new Reservation(7, 7.00,6 , 2);
     //               reservations[x].print();
        addReservation(5, 5.30, 8300, 3);
        displayReservations();
        }



    public void addReservation (int numPeople, double time, long timeMade, int priority){
        Reservation chair = new Reservation(numPeople, time, timeMade, priority);
        for(int x = 0; x < reservations.length; x++){
            if (reservations[x] == null){
                System.out.println("empty");
                reservations[x] = chair;
                reservations[x].print();
                break;
            }
        }
        //reservations[5] = new Reservation(numPeople, time, timeMade, priority);
    }
    public void displayReservations(){
        for (int x=0;x<reservations.length;x++){
            if (reservations[x] == null){
                System.out.println("Reservation does not exist");
            }
            reservations[x].print();
        } 
// add reservation, display reservation method
    }
}

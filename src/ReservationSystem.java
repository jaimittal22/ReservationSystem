public class ReservationSystem {

    public static void main(String[] args) {
        ReservationSystem jarvis = new ReservationSystem();
    }

    public ReservationSystem(){
        Reservation gavin = new Reservation(4, 2.00, 1000, 1);
        gavin.print();

        Reservation dog = new Reservation(4, 8, 645, 1);
        dog.print();

        Reservation [] reservations = new Reservation[10];
        reservations[0] = gavin;
        reservations[1] = dog;
        reservations[1].print();
        reservations[2] = new Reservation(3, 9.00, 4000, 4);
        reservations[2].print();
        for(int x = 3; x < 10; x++){
            reservations[x] = new Reservation(7, 7.00,6 , 2);
                    reservations[x].print();
        }
        public void addReservation (int numPeople, double time, int priority, long timeMade){
            reservations[reservationsMade] = new Reservation(numPeople, time, priority, timeMade);
            reservationsMade++;
        }
        public void displayReservations(){
            for (int i=0;i<reservations.length;i++){
                reservations[i].makeString();
            }
        }
// add reservation, display reservation method
    }
}

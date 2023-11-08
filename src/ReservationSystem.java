import java.util.Scanner;

public class ReservationSystem {

    public static void main(String[] args) {
        ReservationSystem jarvis = new ReservationSystem();
    }

    Reservation[] reservations = new Reservation[10];

    public ReservationSystem() {
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
        //addReservation(5, 5.30, 8300, 3);
        //displayReservations();
       // SelectionSort();
      //  Sort();
        boolean continueee = true;
        while(continueee ==true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("what is your name?");
            String name = scan.nextLine();
            System.out.println("hello " + name + "!");
            System.out.println("How can I help you today?");
            System.out.println("Press 1 to make a reservation");
            System.out.println("Press 2 to view a reservation");
            System.out.println("Press 3 to sort reservations");
            System.out.println("Press 4 to cancel a reservation");
            String choice = scan.nextLine();
            boolean isfull = true;
            for (int x = 0; x < reservations.length; x++) {
                if (reservations[x] == null) {
                    isfull = false;
                }
            }
            if (choice.equals("1")) {
                if (isfull == true) {
                    System.out.println("We are not accepting reservations at this time.");
                } else {
                    System.out.println("How many people is the reservation for?");
                    String numberpeople = scan.nextLine();
                    System.out.println("What time is the reservation?");
                    String time = scan.nextLine();
                    addReservation(Integer.parseInt(numberpeople), Double.parseDouble(time), System.currentTimeMillis(), System.currentTimeMillis());
                }
            }
            if (choice.equals("2")) {
                displayReservations();
            }
            if (choice.equals("3")){
            Sort();
            displayReservations();
            }
            if (choice.equals("4")){
                displayReservations();
                System.out.print("Enter your reservation number to cancel the reservation: ");
                String resNum = scan.nextLine();
                int num = Integer.parseInt(resNum);
            //    for (int i = 0; i < reservations.length; i++) {
                    if (reservations[num] != null ) {
                        reservations[num] = null;
                        System.out.println("Reservation " + resNum + " canceled.");

                    }
                    else{
                        System.out.print("Reservation could not be found ");
                    }
                //}
            }

            System.out.println("Is there anything else I can help with?");

            String choices = scan.nextLine();

            if (choices.equals("Yes")) {
                continueee = true;
            }

            if (choices.equals("No")){
                continueee = false;
                System.out.println("Thank you!");
            }

        }

    }
    public void addReservation(int numPeople, double time, long timeMade, long priority) {
        Reservation chair = new Reservation(numPeople, time, timeMade, priority);
        for (int x = 0; x < reservations.length; x++) {
            if (reservations[x] == null) {
                System.out.println("empty");
                reservations[x] = chair;
                reservations[x].print();
                break;
            }
        }
        //reservations[5] = new Reservation(numPeople, time, timeMade, priority);
    }

    public void SelectionSort() {
        int[] waffles = new int[10];

        for (int i = 0; i < waffles.length; i++) {
            waffles[i] = (int) (Math.random() * 100);
            System.out.print(waffles[i] + ", ");
        }
        System.out.println();
        int n = waffles.length;

        for (int k = 0; k < n - 1; k++) {
            int minIndex = k;
            for (int v = k + 1; v < n; v++) {
                if (waffles[v] < waffles[minIndex]) {
                    minIndex = v;
                }
            }

            int temp = waffles[minIndex];
            waffles[minIndex] = waffles[k];
            waffles[k] = temp;
        }
        for (int i = 0; i < waffles.length; i++) {
            System.out.print(waffles[i] + ", ");
        }
        System.out.println();
    }

    public void Sort() {
        int n = reservations.length;

        for (int i = 0; i < n - 1; i++) {
            int minimum_int = i;
            for (int j = i + 1; j < n; j++) {
                if (reservations[j]  != null && reservations[minimum_int]!= null) {
                  if (reservations[j].priority < reservations[minimum_int].priority) {
                      minimum_int = j;
                  }
                }



                //swap values
                Reservation temp = reservations[minimum_int];
                reservations[minimum_int] = reservations[i];
                reservations[i] = temp;

            }


        }
    }


            public void displayReservations() {
                for (int x = 0; x < reservations.length; x++) {
                    if (reservations[x] == null) {
                        System.out.println("Reservation does not exist");
                    }
                    else{
                        System.out.print(x+ ": ");
                        reservations[x].print();
                    }
                }
// add reservation, display reservation method
            }


        }

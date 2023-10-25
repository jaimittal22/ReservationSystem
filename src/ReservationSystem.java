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
        addReservation(5, 5.30, 8300, 3);
        displayReservations();
        SelectionSort();
        Sort();
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = scan.nextLine();
        System.out.println("hello" + name + "!");
        // displayReservations();

    }


    public void addReservation(int numPeople, double time, long timeMade, int priority) {
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
                        reservations[x].print();
                    }
                }
// add reservation, display reservation method
            }


        }

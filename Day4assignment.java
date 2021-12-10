
import java.util.Scanner;

class Cab {
    int fare;

    public Cab() {
        int fare = 40;
    }

    public Cab(int a) {
        fare = a;
    }

    void showFare() {
        System.out.println("Total Fare: " + fare);
    }
}

class RideCab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int d = 0;
        int cd = 0;

        System.out.print("Enter the cab distance: ");
        cd = sc.nextInt();

        System.out.print("Enter the distance travelled by user: ");
        d = sc.nextInt();

        if (cd > 5) {
            Cab ob = new Cab(40 + (cd - 5) * 10); // calls parameterized constructor
            ob.fare = ob.fare + 10 * d;

            ob.showFare();
        } else {
            Cab ob = new Cab(); // look for default constructor
            ob.fare = ob.fare + 10 * d;

            ob.showFare();
        }

    }
}

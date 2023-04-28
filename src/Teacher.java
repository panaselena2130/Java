import java.util.Locale;
import java.util.Scanner;

public class Teacher extends Person {
    int wage;



    public Teacher () {
        super ();
    }

    Teacher(int id, String firstName, String lastName,  MartialStatus status,int wage ) {

        super(id, firstName,lastName,status);
        this.wage = wage;
    }

//    public void show() {
//        String stateStatus = getStateStatus();
//        System.out.println(id + " " + firstName + " " + lastName + " " + stateStatus + " " + wage);
//
//    }

    public void input() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID:");
        this.id = scan.nextInt();
        System.out.println("Enter firstName:");
        this.firstName = scan.next();
        System.out.println("Enter lastName:");
        this.lastName = scan.next();
        System.out.println("Enter wage:");
        this.wage = scan.nextInt();
        System.out.println("Enter status: (ONE: Single, TWO: Married, THREE: Divorced");
        this.status = switch (scan.next().toUpperCase()) {
            case "ONE" -> MartialStatus.SINGLE;
            case "TWO" -> MartialStatus.MARRIED;
            case "THREE" -> MartialStatus.DIVORCED;
            default -> status;
        };

    }




        public String toString(){
            return  " ID: " + id + " , " + " firstName: " + firstName.substring(0,1).toUpperCase() +firstName.substring(1) + " , " + " lastName: " + lastName.substring(0,1).toUpperCase()+lastName.substring(1) + " , " + " status: " +  status + " , " + " wage: " + wage;

        }

    }


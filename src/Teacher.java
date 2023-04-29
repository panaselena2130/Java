import java.util.Locale;
import java.util.Objects;
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
        System.out.println(status); //It's for me to know wats is value of status;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID:");

        while (true)
        {

            try
            {
                this.id = scan.nextInt();
                break;
            }
            catch (Exception ayde)
            {

                System.out.println("Invalid input, try again");
                scan.nextLine();

            }

        }
//        {if (scan.hasNextInt()){
//            this.id = scan.nextInt();
//            System.out.println("Input correct");
//
//        }
//        else {
//            System.out.println("Invalid input. Return to main menu");
//            return;
//        }
//
//        }

        System.out.println("Enter firstName:");
        this.firstName = scan.next();
        System.out.println("Enter lastName:");
        this.lastName = scan.next();
        System.out.println("Enter wage:");
        while (true)
        {
            try {this.wage = scan.nextInt();
                break;

        }
            catch (Exception salary){
                System.out.println("Invalid input, try again");
                scan.nextLine();
            }

        }

        System.out.println("Enter status: (ONE: Single, TWO: Married, THREE: Divorced");
        this.status = switch (scan.next().toUpperCase()) {
            case "ONE" -> MartialStatus.SINGLE;
            case "TWO" -> MartialStatus.MARRIED;
            case "THREE" -> MartialStatus.DIVORCED;
            default -> status ;
        };

    }




        public String toString(){
            return  " ID: " + id + " , " + " firstName: " + firstName.substring(0,1).toUpperCase() +firstName.substring(1) + " , " + " lastName: " + lastName.substring(0,1).toUpperCase()+lastName.substring(1) + " , " + " status: " +  status + " , " + " wage: " + wage;

        }

    }


import com.sun.jdi.connect.Connector;

import java.io.FileNotFoundException;
import java.util.Scanner;



public class  Person {


    public Person () {}
    public  void input()  {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID:");

        while (true) {
            try
            {
                this.id = scan.nextInt();
                break;
            }
            catch (Exception ayde)
            {

                System.out.println("Incorrect input");
                scan.nextLine();
            }
        }





//        if (scan.hasNextInt()){
//            this.id  = scan.nextInt();
//            System.out.println("The number entered" + scan.nextInt());
//
//        }
//        else {
//            System.out.println("incorrect input");
//        }


        System.out.println("Enter firstName:");
        this.firstName = scan.next();
        System.out.println("Enter lastName:");
        this.lastName = scan.next();
        System.out.println("Enter status: (ONE: Single, TWO: Married, THREE: Divorced");
        this.status = switch (scan.next().toUpperCase()) {
            case "ONE" -> MartialStatus.SINGLE;
            case "TWO" -> MartialStatus.MARRIED;
            case "TREE" -> MartialStatus.DIVORCED;
            default -> status;

        };
    }



    public  enum MartialStatus {SINGLE,MARRIED,DIVORCED}
    int id; //the Person's id number;
    public String firstName;//the Person's first name;
    public String lastName;//the Person's last name;
    public MartialStatus status; //the Person's martial status;


    public Person(int id, String firstName, String lastName, MartialStatus status ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;


    }


    public String toString(){
        //
        // return firstName+ " , " + status;
        return  " ID: " + id + " , " + " firstName: " + firstName.substring(0,1).toUpperCase()+firstName.substring(1) + " , " + " lastName: "+ lastName.substring(0,1).toUpperCase()+lastName.substring(1) + " , " + " status: " +    status ;

    }

//    public void show()  {  String stateStatus = getStateStatus();
//        System.out.println(id + " "+ firstName + " " + lastName +  " " + stateStatus);    }

//    public String getStateStatus()  {
//        return switch (status){
//            case SINGLE -> "Single";
//            case MARRIED -> "Married";
//            case DIVORCED -> "Divorced";
//
//
//        };
//    }




    }


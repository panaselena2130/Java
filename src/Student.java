import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {

    ArrayList<Score> scores = new ArrayList<Score>();

    Student() {
        super();

    }



    public String toString() {

//        return firstName + " , " + getAverageScore() + " averagescore ";
        return " ID: " + id + " , " + " firstName: " + firstName.substring(0,1).toUpperCase()+ firstName.substring(1) + " , " + " lastName: "+ lastName.substring(0,1).toUpperCase() +lastName.substring(1) + " , " + " status: " +    status + " , " + getAverageScore() + " averagescore ";
    }


    public double getAverageScore() {
        double sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum += scores.get(i).value;
        }

        return sum/scores.size();


    }


}










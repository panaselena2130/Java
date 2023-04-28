import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    //public  enum MartialStatus {SINGLE,MARRIED,DIVORCED};

    public static void main (String[]args){

        ArrayList<Person>people = new ArrayList<Person>();

        boolean bigloop = true;

        while (bigloop){
            System.out.println("1. Add Teacher");

            System.out.println("2. Add Student");
            System.out.println("3. Show All People");
            System.out.println("4. Show All Teachers");
            System.out.println("5. Show All Students");
            System.out.println("6. Show Teachers by ID");
            System.out.println("7. Show Students by ID");
            System.out.println("8. Show Students by Score Range");
            System.out.println("9. Quit");
            Scanner scan = new Scanner(System.in);

            switch (scan.nextInt()){
            case 1 -> {System.out.println("1. Add Teacher");
                Teacher tempTeacher = new Teacher();
                tempTeacher.input();
                people.add(tempTeacher);

//                    System.out.println("Input id");
//                    int temp_teach_id = scan.nextInt();
//                    System.out.println("Input firstname");
//                    String temp_teach_firstname = scan.next();
//                    System.out.println("Input lastname");
//                    String temp_teach_lastname = scan.next();
//                    System.out.println("Input status (SINGLE/MARRIED/DIVORCED)");
//                    int temp_teach_status = scan.nextInt();
//                    System.out.println("Input wage");
//                    int temp_teach_wage = scan.nextInt();
//
//                    Teacher tempTeacher = new Teacher( temp_teach_id,  temp_teach_firstname,temp_teach_lastname,switch (scan.nextInt()){
//                        case 1 -> MartialStatus.SINGLE;
//                        case 2 -> Person.MartialStatus.TWO;
//                        case 3 -> Person.MartialStatus.THREE;
//                        default -> System.out.println();
//
//                    },temp_teach_wage );

                    }
            case 2 -> { System.out.println("2. Add Student");
                    Student tempStudent = new Student();
                    tempStudent.input();
                    people.add(tempStudent);}


            case 3 -> { System.out.println("3. Show All People");
                for (int i = 0; i<people.size();i++){
                    System.out.println(people.get(i).toString());
                }

            }
                case 4 -> { System.out.println("4. Show All Teachers");
                for (int i = 0; i<people.size(); i++){
                    if (people.get(i) instanceof Teacher)

                System.out.println(((Teacher)people.get(i)).toString());
                }
            }
                case 5 -> {System.out.println("5. Show All Students");

                for (int i = 0; i<people.size(); i++){
                    if (people.get(i) instanceof Student)

                        System.out.println(((Student)people.get(i)).toString());
                }
            }
                case 6 -> {

                System.out.println("6. Show Teacher by ID");
                    System.out.println("Enter Teacher ID:");
                int temp_id_Teacher = scan.nextInt();
                boolean nayden = false;

                for(int i = 0; i<people.size();i++) {
                    if (temp_id_Teacher == people.get(i).id) {
                        if (people.get(i) instanceof Teacher) {
                            System.out.println(people.get(i).toString());
                            nayden = true;
                        }
                        else {
                            System.out.println("Not a teacher");
                            nayden = true;
                            break;
                        }
                    }
                }

                if (!nayden) System.out.println("Doesn't exist");
            }



                case 7 -> {System.out.println("7. Show Student by ID");
                    System.out.println("Enter Student ID:");
                int temp_id_Student = scan.nextInt();
                boolean nayden = false;
                for(int i=0; i<people.size();i++) {

                    if (temp_id_Student== people.get(i).id ){
                        if (people.get(i) instanceof Student){
                            System.out.println(people.get(i).toString());

                            nayden = true;
                            boolean loop = true;

                            while (loop) {
                                System.out.println("a.Show All Scores");
                                System.out.println("b.Insert a new Scores");
                                System.out.println("c.Show Average Scores");
                                System.out.println("d.Return to the Main Menu");
                                String choice = scan.next();

                                switch (choice) {
                                    case "a" -> {
                                        for (int y = 0; y < ((Student) people.get(i)).scores.size(); y++) {
                                            System.out.println(" ind.-" + y + ", " + " course_name -" + ((Student) people.get(i)).scores.get(y).course.toUpperCase() + ", "+ " score_value -" + ((Student) people.get(i)).scores.get(y).value );
                                        }
                                    }

                                    case "b" -> {
                                        System.out.println("Enter a course name");
                                        String temp_course = scan.next();
                                        System.out.println("Enter a score value");
                                        int temp_score = scan.nextInt();
                                        Score tempScore = new Score(temp_course, temp_score);
                                        ((Student) people.get(i)).scores.add(tempScore);
                                    }
                                    case "c" -> {
                                        System.out.println((("Average Score: " + String.format("%.2f",((Student) people.get(i)).getAverageScore()))));
                                    }

                                    case "d" -> {
                                        loop = false;
                                    }

                                    default -> System.out.println("Invalid option");
                                }
                            }

                        }
                        else {
                            System.out.println("Not a Student");
                            nayden = true;
                            break;}


                        }

                    }

                if(!nayden) System.out.println("Doesn't exist");

                }

                case 8 -> {
                    System.out.println("8. Show Students by Score Range");
                    System.out.println("Enter minimum score");
                    int minScore = scan.nextInt();
                    System.out.println("Enter maximum score");
                    int maxScore = scan.nextInt();
                    for(int i=0; i<people.size(); i++){
                        if (people.get(i) instanceof Student)
                        {
                            if (((Student) people.get(i)).getAverageScore()>minScore && ((Student) people.get(i)).getAverageScore()<maxScore)
                            {
                                System.out.println(" Students with the average score in the range from " + minScore+ "  to  " + maxScore + " are " + people.get(i).toString());
                            }
                        }
                    }

                }

                case 9 -> {
                    bigloop = false;
                }


                case 0 -> {
                    bigloop = false;
                }




                default -> System.out.println("Invalid option");

            }



        }


    }

}



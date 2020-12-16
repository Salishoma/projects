package school.department;

import java.util.HashMap;
import java.util.HashSet;

public class Principal extends Staffs implements School{

    public static HashMap<String, String> studentsAdmission = new HashMap<>();
    public static HashSet<String> studentsAdmissionNumbers = new HashSet<>();

    public Principal() {
        super("Iruamaka", "Principal");
    }

    public HashMap<String, String> getStudentsAdmission() {
        return studentsAdmission;
    }

    public HashSet<String> getStudentsAdmissionNumbers() {
        return studentsAdmissionNumbers;
    }

    public  String admit(String name, int age, int level){
        if(age <= 10 || age >= 20){
            System.out.println("You do not meet the school's requirement for admission");
            return "0";
        }else if(level < 1 || level > 6){
            System.out.println("We only have classes from jss 1 to 3, and from ss 1 to 3");
            return "0";
        }else{
            int admissionNumber = 1;
            int max = 1000;
            String studentNumber = Integer.toString(admissionNumber);
            while(studentsAdmissionNumbers.contains(studentNumber)){
                admissionNumber = (int) (Math.random() * max) + 1;
                studentNumber = Integer.toString(admissionNumber);
            }
            studentsAdmission.put(name + "#" + studentNumber,  studentNumber);
            studentsAdmissionNumbers.add(studentNumber);
            System.out.println(name + " has been admitted into the school, admission number: " + studentNumber);
            return studentNumber;
        }
    }

    public boolean checkInDatabase(String name, String admissionNumber){
        return studentsAdmission.containsKey(name + "#" + admissionNumber);
    }

    public boolean expel(String name, String admissionNumber) {

        // Check if student's record is in schools register, remove student from school if student is found
        if (studentsAdmission.containsKey(name + "#" + admissionNumber)) {
            System.out.println("Admission number: " + studentsAdmission.get(name + "#" + admissionNumber));
            studentsAdmission.remove(name + "#" + admissionNumber);
            studentsAdmissionNumbers.remove(admissionNumber);
            System.out.println(name.split("#")[0] + " with admission number " + admissionNumber + " has been expelled");
            return true;

        } else {
            System.out.println("Student's name not on record");
        }
        return false;
    }
}

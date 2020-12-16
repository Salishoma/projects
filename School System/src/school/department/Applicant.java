package school.department;

import java.util.ArrayList;
import java.util.List;

public class Applicant {
    private static String name;
    private final int age;
    private final int level;
    public Principal principal;
    private static String admissionNumber;
    private static ArrayList<Students> classes = new ArrayList<>(6);;

    public Applicant(String name, int age, int level, Principal principal) {
        Applicant.name = name;
        this.age = age;
        this.level = level;
        this.principal = principal;
        Applicant.admissionNumber = "0";
//        classes =
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getLevel() {
        return level;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public boolean seekAdmission(){

        // check if the student is qualified for admission
        admissionNumber = principal.admit(name, age, level);
        if(!admissionNumber.equals("0")){
            System.out.println("congrats, you have been given admission, your class is " + (level <= 3 ? "jss" + level : "ss" + (level - 3)) );
            return false;
        }
        return true;
    }

    public void addToClass(){

        // If an applicant has been given admission number, this means the applicant is now a student of the school,
        // so the student can be added to a class
        if(!admissionNumber.equals("0")){
            Students student = new Students(name, age, level, admissionNumber);
            classes.add(student);
            System.out.println("Your admission number is " + admissionNumber + " your class is " + (level <= 3 ? "jss" + level : "ss" + (level - 3)));
        }
    }
}

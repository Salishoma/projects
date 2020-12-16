package school.department;

import java.util.ArrayList;

public class Students {
    private String name;
    private  int age;
    private int level;
    private static String admissionNumber;
    private static ArrayList<String> courses;

    public Students(String name, int age, int level, String admissionNumber) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.admissionNumber = admissionNumber;
        this.courses = new ArrayList<>();
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

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public boolean addCourse(String course){
        if(!admissionNumber.equals("0")){
            if(courses.contains(course)){
                System.out.println("You already have " + course + " in your list of courses");

            }else if(courses.size() < 8){
                courses.add(course);
                System.out.println(name + ", " + course + " has been added to your list of courses, " +
                        "you are taking a total of " + courses.size() + " courses");
                return true;
            }else{
                System.out.println("You have reached the maximum number of courses you can take");
            }
        }else{
            System.out.println("You can't perform this action");
        }
        return false;
    }
}

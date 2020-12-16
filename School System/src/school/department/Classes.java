package school.department;

import java.util.ArrayList;

public class Classes extends Principal{
    private final String name;
    private  final String assignedTeachers;
    private final int level;
    private final ArrayList<Students> newStudent;

    public Classes(String name, String assignedTeachers, int level) {
        super();
        name = name.toLowerCase();
        if(level >= 1 && level <= 6){
            if(level <= 3){
                this.name = "Junior class";
            }else if(name.equals("science") || name.equals("art") || name.equals("commercial")){
                this.name = name;
            }else{
                throw new IllegalArgumentException("No such class exist");
            }
            this.newStudent = new ArrayList<Students>();
            this.assignedTeachers = assignedTeachers;
            this.level = level;
        }else{
            throw new IllegalArgumentException("No such class exist");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Students> getStudent() {
        return newStudent;
    }

    public String getAssignedTeachers() {
        return assignedTeachers;
    }

    @Override
    public void park(){
        System.out.println("School class can't have a parking space");
    }

    @Override
    public void  teach(String subject){
        System.out.println("Students are taught in the classes");
    }

    @Override
    public String admit(String name, int age, int level) {
        System.out.println("Not authorised to add to database");
        return "void";
    }

    @Override
    public boolean expel(String name, String admissionNumber) {
        System.out.println("Not authorised to remove from database");
        return false;
    }

    public boolean check(String name, String admissionNumber) {
        super.getStudentsAdmission();
        boolean isStudent = super.checkInDatabase(name, admissionNumber);

        // check if student's record is in school's record, if it is not in school record, remove the
        // student's record from class record
        if(!isStudent){
            for(Students student : newStudent){
                if(student.getAdmissionNumber().equals(admissionNumber)){
                    newStudent.remove(student);
                    System.out.println(name + " is no longer a student of this school");
                    return false;
                }
            }
        }
        System.out.println(name + " is still a student of this school");
        return isStudent;
    }

    public void print(){

        // Display the students record
        for(Students student : newStudent){
            System.out.println("Student's name: " + student.getName() + "; Admission number: " + student.getAdmissionNumber());
        }
    }

    public String addStudentToClass(Students student){

        // check if student's record is in school's record, if it is not in school record, add the
        // student's record to class record
        if(student.getAdmissionNumber().equals("0")){
            System.out.println(student.getName() + " is not a bona fide student of this school.");
            return "";
        }
        newStudent.add(student);
        System.out.println(student.getName() + " with admission number " + student.getAdmissionNumber() +
            " has been added to " + getName() + " class " + (level <= 3 ? "jss" + student.getLevel() : "ss" + (student.getLevel() - 3)) + ". ");
        return getName();
    }
}

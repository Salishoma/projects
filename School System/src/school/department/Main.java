package school.department;

public class Main {

    public static void main(String[] args) {
        Principal principal = new Principal();
        Applicant applicant = new Applicant("Ade", 15, 6, principal);
        System.out.println(applicant.getName() +"'s admission number is " + applicant.getAdmissionNumber());
        applicant.seekAdmission();
        System.out.println(principal.getStudentsAdmissionNumbers());
        System.out.println(applicant.getAdmissionNumber());
        Students student = new Students(applicant.getName(), applicant.getAge(), applicant.getLevel(), applicant.getAdmissionNumber());
        System.out.println("The student's admission number is " + student.getAdmissionNumber());
        System.out.println(student.getLevel());
        Classes classes = new Classes("Science", "Gbademu", student.getLevel());
        String currentClass = classes.addStudentToClass(student);
        System.out.println(currentClass);
        Staffs teacher = new Staffs("Tosin", "teacher");
        Staffs cleaner = new Staffs("Kome", "Cleaner");
        student.addCourse("Mathematics");
        student.addCourse("English");
        student.addCourse("Physics");
        student.addCourse("Mathematics");
        student.addCourse("Biology");
        student.addCourse("Geography");

        principal.park();
        teacher.park();
        cleaner.park();

        principal.teach("English");
        teacher.teach("Mathematics");
        cleaner.teach("Civic");

        principal.admit("Nonso", 18, 5);
        String james = principal.admit("James", 15, 5);
        principal.admit("Greg", 10, 6);
        principal.admit("Nonso", 23, 1);
        System.out.println("Records" + principal.getStudentsAdmissionNumbers().toString());
        classes.check("Ade", "1");
        principal.expel("Ade", "1");
        classes.check("Ade", "1");
        classes.print();
        principal.admit("Tobi", 13, 5);
    }
}

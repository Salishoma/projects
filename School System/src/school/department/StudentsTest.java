package school.department;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentsTest {
    Principal principal = new Principal();
    Applicant applicant = new Applicant("Ade", 15, 6, principal);
    Students student = new Students(applicant.getName(), applicant.getAge(), applicant.getLevel(), applicant.getAdmissionNumber());
    ArrayList<String> courses = new ArrayList<>();


    @Test
    public void getName() {
        assertEquals("Ade", student.getName());
    }

    @Test
    public void getAge() {
        assertEquals(15, student.getAge());
    }

    @Test
    public void getLevel() {
        assertEquals(6, student.getLevel());
    }

    @Test
    public void getAdmissionNumber() {
        assertEquals("0", student.getAdmissionNumber());
    }

    @Test
    public void getCourses() {
        assertFalse(student.addCourse("Mathematics"));
    }

    @Test
    public void addCourse() {
        assertFalse(student.addCourse("Mathematics"));
    }
}
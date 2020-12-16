package school.department;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClassesTest {
    ArrayList<Students> newStudent = new ArrayList<>();
    Students student = new Students("Ade", 15, 6, "1");
    Classes classes = new Classes("Science", "Jude", 5);
    @Test
    public void getName() {
        assertEquals("science", classes.getName());
    }


    @Test
    public void getStudent() {
        newStudent.add(student);
        assertEquals("Ade", newStudent.get(0).getName());
    }

    @Test
    public void getAssignedTeachers() {
        assertEquals("Jude", classes.getAssignedTeachers());
    }
}
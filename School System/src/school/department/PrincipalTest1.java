package school.department;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.*;

public class PrincipalTest1 {
    Principal principal = new Principal();
    HashMap<String, String> studentsAdmission = new HashMap<>();
    HashSet<String> studentsAdmissionNumbers = new HashSet<>();
    Applicant applicant = new Applicant("Ade", 15, 6, principal);

    @Test
    public void admit() {

        assertEquals("1", principal.admit("Ade", 15, 6));
    }

    @Test
    public void checkInDatabase() {
        studentsAdmission.put(applicant.getName() + "1", "1");
        assertTrue(studentsAdmission.containsKey(applicant.getName() + "1"));
    }

    @Test
    public void expel(){
        studentsAdmission.put(applicant.getName() + "1", "1");
        assertEquals("1", studentsAdmission.remove(applicant.getName() + "1"));
    }
}
package school.department;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class ApplicantTest {

    private static Applicant applicant;

    @Test
    public void seekAdmissionPass() {
        applicant = new Applicant("Nkechi", 15, 1, (new Principal()));
        boolean isUpToTen = applicant.getAge() >= 10 && applicant.getAge() <= 20;
        assertTrue(isUpToTen);
    }

    @Test
    public void seekAdmissionFail() {
        applicant = new Applicant("Nkechi", 9, 1, (new Principal()));
        boolean isUpToTen = applicant.getAge() >= 10 && applicant.getAge() <= 20;
        assertFalse(isUpToTen);

    }
}
package school.department;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaffsTest {
    Staffs staffs = new Staffs("Okoro Magnus", "Secretary");
    @Test
    public void getName() {
        assertEquals("Okoro Magnus", staffs.getName());
    }

}
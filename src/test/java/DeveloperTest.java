import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Churlie", 30.00, "Churlie22");
    }

    @Test
    public void checkGetSalary(){
        Employee employee = (Developer) developer;
        assertEquals(30.00, employee.getSalary(), 0.01);
    }

    @Test
    public void checkGetNINO(){
        Employee employee = (Developer) developer;
        assertEquals("Churlie22", employee.getNino());
    }


    @Test
    public void checkRaiseSalary(){
        Employee employee = (Developer) developer;
        assertEquals(240.00, employee.increaseSalary(8), 0.1);
    }

    @Test
    public void checkPayBonus(){
        Employee employee = (Developer) developer;
        assertEquals(0.3, employee.payBonus(), 0.1);
    }
}

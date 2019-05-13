import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Churlie", 30.00, "Churlie22");
    }


    @Test
    public void checkGetSalary(){
        Employee employee = (DatabaseAdmin) databaseAdmin;
        assertEquals(30.00, employee.getSalary(), 0.01);
    }

    @Test
    public void checkGetNINO(){
        Employee employee = (DatabaseAdmin) databaseAdmin;
        assertEquals("Churlie22", employee.getNino());
    }


    @Test
    public void checkRaiseSalary(){
        Employee employee = (DatabaseAdmin) databaseAdmin;
        assertEquals(240.00, employee.increaseSalary(8), 0.1);
    }

    @Test
    public void checkPayBonus(){
        Employee employee = (DatabaseAdmin) databaseAdmin;
        assertEquals(0.3, employee.payBonus(), 0.1);
    }
}

import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Billy Bob", 12.00, "SV12B90V", "Finance");
    }

    @Test
    public void checkGetManagerName(){
        assertEquals("Billy Bob", manager.getName());
    }

    @Test
    public void checkGetManagerSalary(){
        Employee employee = (Manager) manager;
        assertEquals(12.00, employee.getSalary(), 0.01);
    }

    @Test
    public void checkGetManagerNINO(){
        Employee employee = (Manager) manager;
        assertEquals("SV12B90V", employee.getNino());
    }

    @Test
    public void checkGetManagerDeptName(){
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void checkRaiseSalary(){
        Employee employee = (Manager) manager;
        assertEquals(96.00, employee.increaseSalary(8), 0.1);
    }

    @Test
    public void checkRaiseSalaryWithNeg(){
        Employee employee = (Manager) manager;
        assertEquals(0, employee.increaseSalary(-10), 1);
    }

    @Test
    public void checkPayBonus(){
        Employee employee = (Manager) manager;
        assertEquals(0.12, employee.payBonus(), 0.1);
    }
}

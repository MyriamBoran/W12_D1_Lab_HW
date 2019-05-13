import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Myriam", 50.00, "DaBoss22", "Department of Boss", 30.00);
    }

    @Test
    public void checkBudget(){
        assertEquals(30.00, director.getBudget(), 0.01);
    }

    @Test
    public void checkGetManagerName(){
        assertEquals("Myriam", director.getName());
    }
//
    @Test
    public void checkGetManagerSalary(){
        assertEquals(50.00, director.getSalary(), 0.01);
    }
//
    @Test
    public void checkGetManagerNINO(){
        assertEquals("DaBoss22", director.getNino());
    }
//
    @Test
    public void checkGetManagerDeptName(){
        assertEquals("Department of Boss", director.getDeptName());
    }
//
    @Test
    public void checkRaiseSalary(){
        Employee employee = (Director) director;
        assertEquals(400.00, employee.increaseSalary(8), 0.1);
    }
//
    @Test
    public void checkPayBonus(){
        Employee employee = (Director) director;
        assertEquals(0.5, employee.payBonus(), 0.1);
    }
}

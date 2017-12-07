package Staff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;


    @Before
    public void before() {
        employee = new Employee("John", "JH 67 89 43 B", 23000);
    }


    @Test
    public void canGetName(){
        assertEquals("John", employee.getName());
    }

    @Test
    public void setName() {
        employee.setName("Jan");
        assertEquals("Jan", employee.getName());
    }

    @Test
    public void getNINumber() {
        assertEquals("JH 67 89 43 B", employee.getNINumber());
    }

    @Test
    public void setNINumber() {
        employee.setNINumber("JT 76 48 64 B");
        assertEquals("JT 76 48 64 B", employee.getNINumber());
    }

    @Test
    public void getSalary() {
        assertEquals(23000, employee.getSalary());
    }

    @Test
    public void setSalary() {
        employee.setSalary(24000);
        assertEquals(24000, employee.getSalary());
    }

    @Test
    public void raiseSalary() {
        employee.raiseSalary(1.10);
        assertEquals(25300, employee.getSalary());
    }

    @Test
    public void payBonus() {
        assertEquals(230, employee.payBonus());
    }
}

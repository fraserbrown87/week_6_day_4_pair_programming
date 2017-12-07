package Management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jeff", "NI 45 67 89 F", 50000, "Sales");
    }

    @Test
    public void getDeptName(){
        assertEquals("Sales", manager.getDeptName());
    }
}

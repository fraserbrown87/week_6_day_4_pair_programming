package Management;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;


    @Before
    public void before(){
        director = new Director("Barry", "YT 99 99 99 Z", 150000, "The Board", 1000000);
    }

    @Test
    public void getBudget(){
        assertEquals(1000000, director.getBudget());
    }

    @Test
    public void payBonus(){
        assertEquals(3000, director.payBonus());
    }


}

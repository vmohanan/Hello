import org.junit.Test;
import static org.junit.Assert.assertEquals;

import quickstart.mathclass;

public class mathTest {
    @Test
    public void AddTest()
    {
        mathclass mc=new mathclass();
        assertEquals(mc.Add(4,5),9);
        assertEquals(mc.Add(0,5),5);
        assertEquals(mc.Add(0,0),0);
    }

    @Test
    public void AddNegativeTest()
    {
        mathclass mc=new mathclass();
        assertEquals(mc.Add(-4,5),1);
        assertEquals(mc.Add(0,-5),-5);
        assertEquals(mc.Add(-1,-2),-3);
        assertEquals(mc.Add(-1,1),0);
        assertEquals(mc.Add(100,100),200);
    }

}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import quickstart.MathClass;

public class mathTest {
    @Test
    public void AddTest()
    {
        MathClass mc=new MathClass();
        assertEquals(mc.Add(4,5),9);
        assertEquals(mc.Add(0,5),5);
        assertEquals(mc.Add(0,0),0);
        assertEquals(mc.Add(100,100),200);
    }

    @Test
    public void AddNegativeNumbersTest()
    {
        MathClass mc=new MathClass();
        assertEquals(mc.Add(-4,5),1);
        assertEquals(mc.Add(0,-5),-5);
        assertEquals(mc.Add(-1,-2),-3);
        assertEquals(mc.Add(-1,1),0);
    }

    @Test
    public void MultiplyTest()
    {
        MathClass mc=new MathClass();
        assertEquals(mc.Multiply(4,5),20);
        assertEquals(mc.Multiply(14,10),140);
        assertEquals(mc.Multiply(100,200),20000);
        assertEquals(mc.Multiply(1,0),0);
    }

    @Test
    public void MultiplyNegativeNumbersTest()
    {
        MathClass mc=new MathClass();
        assertEquals(mc.Multiply(-4,5),-20);
        assertEquals(mc.Multiply(4,-5),-20);
        assertEquals(mc.Multiply(-1,-2),2);
        assertEquals(mc.Multiply(-1,0),0);
    }


}

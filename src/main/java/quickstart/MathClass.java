package quickstart;


public class MathClass {


    public int Add(int Num1,int Num2)
    {
        try {
            Num1 = Num1 + Num2;
        }
        catch (NullPointerException nullPointerException)
        {
            nullPointerException.printStackTrace();
        }
        return Num1;
    }

    public long Multiply(int Num1,int Num2)
    {
        long MVal1=0;
        try {
            MVal1= Num1 * Num2;
        }
            catch (NullPointerException nullPointerException)
            {
            }
        return MVal1;
    }

    public float Divide(int Num1,int Num2)
    {
        float MVal1=0;
        try {
            if (Num2 == 0)
                throw new IllegalArgumentException("divisor is zero");
            else
                MVal1= Num1/Num2;
        } catch (IllegalArgumentException illegalArgumentException)
        {
        }

        return MVal1;
    }

    public int subtract(int Num1,int Num2)
    {
        return Num1-Num2;
    }

}

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
        long MVal1;
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
        return Num1/Num2;
    }

    public int subtract(int Num1,int Num2)
    {
        return Num1-Num2;
    }

}

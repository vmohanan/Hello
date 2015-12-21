package quickstart;


public class MathClass {


    public int Add(int Num1,int Num2)
    {
        int Nu=0;
        try {
            Nu= Num1 + Num2;
        }
        catch (NumberFormatException nfe)
        {

        }
        return Nu;
    }

    public long Multiply(int Num1,int Num2)
    {
        return Num1*Num2;
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

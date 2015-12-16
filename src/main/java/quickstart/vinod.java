package quickstart;


/**
 * Created by vxmohana on 12/16/15.
 */
public class vinod {

    public static void main(String[] args)
    {
        int Num1=0,Num2=0;
        if (args.length != 3)
            System.out.println("1usage: Add/Sub/Mul/Div Op1 Op2");
        else
        {
            try
            {
                Num1=Integer.parseInt(args[1]);
                Num2=Integer.parseInt(args[2]);
            }
            catch (NumberFormatException nfe)
            {
                // If the second or third argument isn't a valid integer.  Print
                // an error message, then exit with an error code.
                System.out.println("The second and third argument must be a number.");
                System.exit(1);
            }

            mathclass mathobj=new mathclass();

            if (args[0].toLowerCase().equals("add"))
                System.out.println(mathobj.Add(Num1,Num2));
            else if (args[0].toLowerCase().equals("sub"))
                System.out.println(mathobj.Add(Num1,Num2));
            else if (args[0].toLowerCase().equals("mul"))
                System.out.println(mathobj.Add(Num1,Num2));
            else if (args[0].toLowerCase().equals("div"))
                System.out.println(mathobj.Add(Num1,Num2));
            else {
                System.out.println("usage: Add/Sub/Mul/Div Op1 Op2");
                System.exit(1);
            }

/*            switch (args[0].toLowerCase())
            {
                case "add" :
                    System.out.println(mathobj.Add(Op1));
                    break;
                case "sub" :
                    System.out.println(mathobj.Add(Op1));
                    break;
                case "mul" :
                    System.out.println(mathobj.Add(Op1));
                    break;
                case "div" :
                    System.out.println(mathobj.Add(Op1));
                    break;
                default :
                    System.out.println("usage: Add/Sub/Mul/Div Op1 Op2");
                    break;

            }
*/

        }

    }
}

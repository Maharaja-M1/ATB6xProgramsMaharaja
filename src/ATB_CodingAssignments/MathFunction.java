package ATB_CodingAssignments;

public class MathFunction
{
    public static void main (String[] args)
    {
        /*find the value of expression
        cuberootof3(x^2+y^2-|z|) */

        double x=10, y= 12.4, z=56.78;

        double xsquare=Math.pow(x,2);
        double ysquare=Math.pow(y,2);
        double zmodulus=Math.abs(z);
        double braces=xsquare+ysquare-zmodulus;
        double result=Math.cbrt(braces);
        System.out.println("Value of the expression is " +result);

    }
}

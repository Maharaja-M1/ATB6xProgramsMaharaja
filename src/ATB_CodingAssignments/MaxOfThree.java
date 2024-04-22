package ATB_CodingAssignments;

public class MaxOfThree
{
    public static void main (String[] args){


    int a=10, b=20, c=30;
    int max=(a>b)?(a>c?a:c):(b>c?b:c);
    System.out.printf("Maximum of three numbers is %d", max);

    }

}

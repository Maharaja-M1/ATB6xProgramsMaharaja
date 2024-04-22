package ATB_CodingAssignments;

public class IncrementDecrementOperators {
    public static void main (String[] args){

        int a=10,b=10;
        //pre-increment operator
        int sum=++a + a++ + a++;

        //post-increment operator
        int exp=--b + b++ + ++b;

        //printing the result
        System.out.println("Value of (++a + a++ + a++) is " +sum);
        System.out.println("Value of (--b + b++ + ++b) is " +exp);

    }
}

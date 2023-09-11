public class Multiples {
    public static void main(String[] args)
    {
        /* Integer upper bound; all integers below are checked if multiples of 3 and 5 */
        int MAX = 1000;

        /* Integer storing number of multiples below MAX */
        int numMultiples = 0;

        /*
        spoke with TA, he said we are "not including 0 in the numbers to check" even though it
        satisfies the definition of 'non-negative number'
         */

        for (int i = 1; i < MAX; i++)
        {
            /* multiples can be divided by 3 or 5, or both */
            if ((i % 3 == 0) || (i % 5 == 0))
            {
                numMultiples++;
            }

        }
        System.out.println(numMultiples);
    }
}

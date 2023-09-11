public class Reduce {
    public static void main(String[] args) {
        // start at 100
        int n = 100;

        // steps accumulator
        int steps = 0;

        while (n != 0)
        {
            // check if n is even
            boolean isEven = (n % 2 == 0);

            if (isEven) {           // If n even divide itself by 2
                n /= 2;
            } else {                // If n odd subtract 1 from n
                n -= 1;
            }
            steps++;
        }
        assert (n == 0);
        System.out.println(steps);
    }
}

import java.math.*;
public class Fibonacci {

    static int calls = 0;


    public static long fib(int p, long prev, long nextprev)
    {
        calls++;
        if (p == 0 && nextprev == 0)
            return 0;
        else if (p == 1)
            return prev;
        else
            return fib(p-1, prev+nextprev, prev);
    }

    public static void main(String[] args) {
        long t0 = System.currentTimeMillis();
        for(int i=0;i <=2000 ;i++) {
            System.out.printf("%d : %d called %d times\n", i, fib(i, 1, 0), calls);
            calls = 0;
        }
        long t = System.currentTimeMillis() - t0;
        System.out.println("Calculated in "+ t +" ms");
    }

    }


package quizes;

// 20.05.2019

public class Ion2 {
    public static void main(String[] args) {
        int increment = -1;

        for (int i=0, j=0; i<10 & j<5; i++, j += 2) {
            increment++;
        }

        System.out.println( "increment = " + increment);

        /* Gauss' summation */
        int sum = 0;
        for (int i = 1; i <= 100; i++) sum += i;
        System.out.println("sum = " + sum);
        System.out.println("kfg = " + (100*101/2));
    }

}

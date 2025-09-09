package lab1;

public class Multiples {
    public static void main(String[] args) {
        //int count = multiples();
        //System.out.println(count);
    }

    public static int multiples(int  n, int a, int b) {
        int multis = 0;
        int i = 1;

        while (i < n) {
            if (i % a == 0) {
                multis++;
            }
            else if (i % b == 0) {
                multis++;
            }
            i++;
        }
        return(multis);
    }

    public static int multiples() {
        return multiples(1000, 5, 3);
    }
}

package lab1;

public class Multiples {
    public static void main(String[] args) {
        int multis = 0;
        int i = 0;

        while (i < 100) {
            if (i % 3 == 0) {
                multis++;
            }
            else if (i % 5 == 0) {
                multis++;
            }
            i++;
        }
        System.out.println(multis);
    }
}

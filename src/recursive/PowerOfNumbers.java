package recursive;

public class PowerOfNumbers {
    public static void main(String[] args) {

    }

    public static int power(int base, int exp) {
        return base * power(base, exp - 1);

    }
}

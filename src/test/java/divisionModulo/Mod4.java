package divisionModulo;

public class Mod4 {
    public static void main(String[] args) {
        int a = 0, b = 2, c = 5;
        a = a + b;
        b = c - a + b;
        c = a + c;
        System.out.println("New value for 'a' is " + a);
        System.out.println("New value for 'b' is " + b);
        System.out.println("New value for 'c' is " + c);
    }
}

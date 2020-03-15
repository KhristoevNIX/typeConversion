package divisionModulo;

public class Mod2 {
    public static void main(String[] args) {
        int x = 76;
        int y = x%10;
        int z = (x/10)%10;
        System.out.println("The SUM of digits of " + x + " number is " + (y + z));
    }
}

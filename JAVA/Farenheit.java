import java.util.Scanner;

public class Farenheit {
    public static void main(String[]args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("c = ");
        double cels = kb.nextDouble();
        double f = 9/5*cels + 32;
        System.out.print("f = "+f);
        kb.close();
    }
}

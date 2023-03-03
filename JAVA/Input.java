import java.util.Scanner;
public class Input {
    public static void main(String[]args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        double b = kb.nextDouble();
        String c = kb.nextLine(); //Find String till the end of the line

        System.out.println(a+", "+b+", "+c);
        kb.close();
    }
}

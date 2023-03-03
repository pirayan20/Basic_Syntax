import java.util.Scanner;
public class Str {
    public static void main(String[]args) {

        String s = "I'm a \"string\"";
        System.out.println(s.substring(2,3));   // print(s[2])
        System.out.println(s.substring(0,4));   // print(s[:4])
        System.out.println(s.substring(1));     // print(s[1:])
        char c = 'x';

        int k = s.length();    // k = len(s)
        String t = s.trim();   // t = s.strip()
        t = s.toUpperCase();   // t = s.upper()
        t = s.toLowerCase();   // t = s.lower()
        k = s.indexOf("OK");   // s.find('OK')
        k = s.indexOf("OK", 10);  // s.find('OK') but starts with 10th index
        boolean boo = s.contains("OK");   // if "OK" in s

        String a = "OK";
        String b = "ok".toUpperCase();
        String d = "O" + "K";
        // System.out.println(a == b);
        // System.out.println(a == d);
        // System.out.println(b == d);
        // sometime use a == can cause a problem, we can use .eqauls() instead for less error
        
        Scanner kb = new Scanner(System.in);
        String sents = kb.nextLine();

        int count = 0;
        for (char i : sents.toUpperCase().toCharArray()){
            if ("AEIOU".indexOf(i) >= 0){
                count++;
            }
        }
        System.out.print("I have " + count + " vowels." );
    }
}
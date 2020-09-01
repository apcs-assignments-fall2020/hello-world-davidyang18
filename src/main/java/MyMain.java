import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your favorite number? ");
        String num = scan.next();
        int x = Integer.parseInt(num);
        System.out.println("My favorite number is, " + (x*2));

        scan.close();
   }
}
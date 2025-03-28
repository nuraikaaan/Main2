import java.util.Scanner;
public class task8 {
    public static String checkDigits(String s) {
        return s.matches("\\d+") ? "Yes" : "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkDigits(s));
        sc.close();
    }
}

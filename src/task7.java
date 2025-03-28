import java.util.Scanner;
public class task7 {
    static Scanner sc = new Scanner(System.in);

    public static void printReverse(int n) {
        if (n == 0) return;

        int num = sc.nextInt();
        printReverse(n - 1);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        printReverse(n);
    }
}


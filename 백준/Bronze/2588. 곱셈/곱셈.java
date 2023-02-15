import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int n1 = B % 10;
        int n2 = B % 100 - n1;
        int n3 = B / 100 * 100;

        System.out.println(A * n1);
        System.out.println(A * n2 / 10);
        System.out.println(A * n3 / 100);
        System.out.println(A * B);
    }
}
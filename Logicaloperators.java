import java.util.Scanner;
class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a > 0 && b > 0);
        System.out.println(a > 10 || b > 10);
        System.out.println(!(a < 10));
    }
}

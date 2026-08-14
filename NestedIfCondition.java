import java.util.Scanner;
public class NestedIfCondition{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    if (A > 0) {
    if (B > 0) {
        System.out.println("Both Positive");
    } else {
        System.out.println("A Positive, B Negative");
    }
} else {
    System.out.println("A is Negative");
}
}
}

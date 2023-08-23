import java.util.*;
public class Prac5 {
    public static void main(String args[]) {
        System.out.print("Enter Decimal Number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Binary No. is : ");
        System.out.println(Integer.toBinaryString(a));
    }
}
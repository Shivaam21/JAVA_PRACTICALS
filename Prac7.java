import java.util.Scanner;
public class Prac7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter the total value");
        int total=sc.nextInt();
        System.out.println("Enter "+total+ " numbers");
        for(int i=0;i<total;i++)
        {
            
            num=sc.nextInt();
            sum+=num;
        }
        System.out.println("Sum of The Numbers entered:-"+sum);
        sc.close();
    }
}
    
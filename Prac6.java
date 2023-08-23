import java.util.Scanner;
public class Prac6 {
    public static void main(String[] args) {
       int flag=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number to be checked");
       int num=sc.nextInt();
        if(num==0||num==1){
            System.out.println(num+" is not a prime number");
            flag=1;
           }
        else{ 
            for(int i=2;i<num;i++){
                if(num%i==0){
                   System.out.println(num+" is not a prime number");
                   flag=1;
                   break;
           }
        }
        }

       
       if(flag==0){
        System.out.println(num+" is a prime number");
    }
       sc.close();
}
}

import java.util.Scanner;
    public class Prac2 {
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
                System.out.println("enter the number");
                int num=sc.nextInt();
                int fact=1;
                for(int i=1;i<num;i++){
                    fact=fact*(i+1);
                }
                System.out.println("factorial of is:"+fact);
                sc.close();
            
        }
        
    }
    


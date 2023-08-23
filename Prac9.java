import java.util.Scanner;
class Distance{
    int inches,feet;
    void getdistance(int feet,int inches){
        this.feet=feet;
        this.inches=inches;
    }
    void showdistance(){
        System.out.println("The distance in feets:-"+feet);
        System.out.println("The distance in inches:-"+inches);

    }
}
public class Prac9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Value in feets:-");
        int f=sc.nextInt();
        System.out.print("Value in inches:-");
        int i=sc.nextInt();
        Distance obj=new Distance();
        obj.getdistance(f, i);
        obj.showdistance();
        sc.close();
    }
    
}

import java.util.Scanner;
public class Prac4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows:-");
        int rows=sc.nextInt();
        System.out.print("Enter the no. of colums:-");
        int columns=sc.nextInt();
        int arr[][]= new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("--------------------------------------------------------");
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
    
}

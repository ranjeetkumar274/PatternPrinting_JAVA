import java.util.Scanner;
public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("enter the no. of rows : ");
        int n = read.nextInt();
        for(int i = 1; i <=n; i++){
            System.out.println();
            for(int j = n; j>=i; j--){
                System.out.print("* ");
            }
        }
    }
}

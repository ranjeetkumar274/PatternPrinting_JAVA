import java.util.Scanner;
public class TriangleStar {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("enter the length of square : ");
        int n = read.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println();
            for(int j = 1; j <= i; j++){
                System.out.print(" *");
            }
        }
    }
}
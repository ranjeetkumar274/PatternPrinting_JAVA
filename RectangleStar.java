import java.util.Scanner;
public class RectangleStar {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("enter the length of rectangle : ");
        int m = read.nextInt();
        System.out.print("enter the width of rectangle : ");
        int n = read.nextInt();
        for(int i = 0; i < m; i++){
            System.out.println();
            for(int j = 0; j < n; j++){
                System.out.print(" *");
            }
        }
    }
}


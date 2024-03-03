import java.util.Scanner;
public class SquareStar {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("enter the length of square : ");
        int n = read.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println();
            for(int j = 0; j < n; j++){
                System.out.print(" *");
            }
        }
    }
}

import java.util.Scanner;

public class MixtureTriangle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("enter the length of square : ");
        int n = read.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (j + 64) + " ");
                }
                else{
                    System.out.print(j+" ");
                }

            }
        }
    }
}
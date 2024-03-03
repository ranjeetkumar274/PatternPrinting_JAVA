import java.util.Scanner;
public class SquareAlphabet{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("enter the length of square : ");
        int m = read.nextInt();
        for(int i = 0; i < m; i++){
            System.out.println();
            for(int j = 1; j <= m; j++){
                System.out.print(j+" ");
            }
        }
    }
}
import java.util.Scanner;

public class DownwardTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();
        int initialStar = 0;
        int space = 0;
        for(int i = 0; i < star; i++){
            for (int j=0; j<space; j++){
                System.out.print(" ");
            }
            for (int j = initialStar; j < star; j++){
                System.out.print("* ");
            }
            System.out.println();
            initialStar++;
            space++;
        }
    }
}

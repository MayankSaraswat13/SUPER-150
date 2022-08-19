import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int row = 1;
        int star = 1;
        int space = 0;
        while (row <= 2 * n - 1) {
            if (row < n) {
                int k = 1;
                while (k <= star) {
                    System.out.print("* ");
                    k++;
                }
                star++;

            } else {
                    int k = 1;
                    while (k <= star) {
                        System.out.print("* ");
                        k++;
                    }
                    star--;
                }
            System.out.println(" ");
              row++;

            }
        }
    }



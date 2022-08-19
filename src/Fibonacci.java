import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1;
        int sum =0;
        for(int i=0; i<=n;i++)
        {
            System.out.println(a);
            sum=a+b;
            a=b;
            b=sum;
        }

    }
}

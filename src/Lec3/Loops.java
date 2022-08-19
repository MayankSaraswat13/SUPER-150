package Lec3;

public class Loops {
    public static void main(String[] args) {
        int n= 342;
        int sum=0;
        int mul=1;
        while(n>0)
        {
            int rem=n%5;
            sum=sum+(rem*mul);
            n=n/5;
            mul=mul*10;

        }
        System.out.println(sum);
    }
}

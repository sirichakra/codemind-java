import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        int x,y,res;
        Scanner read = new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        res=(x*y)/(x+y);
        System.out.println(res);
    }
}
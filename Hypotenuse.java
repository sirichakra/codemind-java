import java.util.Scanner;
public class Demo{
    public static void main(String[] args)
        {
            int a,b;
            double res;
            Scanner read = new Scanner(System.in);
            a = read.nextInt();
            b = read.nextInt();
            res = Math.sqrt((a*a)+(b*b));
            System.out.printf("%.2f",res);
        }
}

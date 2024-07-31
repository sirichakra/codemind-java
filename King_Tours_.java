import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        int m,n;
        Scanner read = new Scanner(System.in);
        m = read.nextInt();
        n = read.nextInt();
        int res = (m*5)+(n*7);
        System.out.println(res);
    }
}
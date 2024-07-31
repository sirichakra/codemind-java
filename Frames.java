import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        int x,y,z;
        int res;
        Scanner read = new Scanner(System.in);
        x = read.nextInt();
        y = read.nextInt();
        z = read.nextInt();
        res=(2*(x+y))*z;
        System.out.println(res);
    }
}
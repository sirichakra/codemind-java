import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        int x,y;
        double loss,loss_percent;
        Scanner read = new Scanner(System.in);
        x = read.nextInt();
        y = read.nextInt();
        loss = x-y;
        loss_percent = (loss/x)*100;
        System.out.printf("%.2f",loss_percent);
    }
}
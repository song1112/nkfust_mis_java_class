import java.util.Scanner;
class bmi {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("請輸入身高(公分)");
        int h = in.nextInt();
        System.out.println("請輸入體重(公斤)");
        int w = in.nextInt();
        double bmi = w/((h*h)/100);
        System.out.println("你的bmi值是:"+bmi);
    }
}

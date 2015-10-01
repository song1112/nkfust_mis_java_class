import java.util.Scanner;

class hw4_37 {
    public static void main(String args[]) {
        System.out.println("輸入階層");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum=1;
        for (int i=1;i<=n;i++) {
            double n_sum=1;
            for (int j=1;j<=i;j++)
                n_sum=n_sum*j;
            sum = sum + 1/n_sum;
        }
        System.out.println("sum:"+sum);
    }
}

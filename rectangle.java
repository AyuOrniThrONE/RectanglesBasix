import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        if (1<=t && t<=1000) {
            for (int i = 0; i < t; i++) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int d=sc.nextInt();
                if (1<=a && a<=10000 && 1<=b && b<=10000 && 1<=c && c<=10000 && 1<=d && d<=10000) {
                    if (a==b && c==d || a==c && b==d || a==d && b==c) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
                
            }
            
        }
    }
}

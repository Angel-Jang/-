import java.util.Scanner;

public class JPA501SE {
    public static void main(String[] args) {
        boolean done = false;
        Scanner scn = new Scanner(System.in);
        while (!done) {
            System.out.print("Input n (0<=n<=16):");
            int n = scn.nextInt();
            if (n == 999){
                done = true;
            }
            else                
                System.out.println(n + "的階乘 = " + factorial(n));
        }
        scn.close();
    }
    static int factorial(int n){
        int num1 = n;

        for (int i = 1; i < n; i++) {
            num1 = num1 * (n - i);
        }
        return num1;
    }
    
}
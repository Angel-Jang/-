import java.util.Scanner;

public class JPA301 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input:");
        int number = scn.nextInt();
        int total = 0;

        for (int i = 0; i < (number + 1); i++) {
            total += i;
        }

        System.out.printf("1 + ... + %d = %d", number , total);
        System.out.println("");
        scn.close();
        
    }
}
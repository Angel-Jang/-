import java.util.Scanner;

public class JPA305 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter one value: ");
            int num = scn.nextInt();
            int total = num;
            if (num < 10 && num >= 1) {
                for (int j = 1; j < num; j++) {
                    total *= (num - j);
                }
                System.out.println(num + "!: " + total);
            }
            else
                System.out.println("Error, the value is out of range.");
        }
        scn.close();
    }
    
}

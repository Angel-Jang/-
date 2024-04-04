import java.util.Scanner;

public class JPA306 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int status = 0;
        while (status != 999) {
            int total = 1;
            System.out.println("Input:");
            int firstNumber = scn.nextInt();
            status = firstNumber;

            int secondNumber = scn.nextInt();

            for (int i = 0; i < secondNumber; i++) {
                total *= firstNumber;

            }
            System.out.println(total);
        }
        scn.close();
    }
}

import java.util.Scanner;

public class JPA307 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input:");
        int firstNumber = scn.nextInt();

        while (firstNumber != 999) {

            int secondNumber = scn.nextInt();
            gcf(firstNumber, secondNumber);

            System.out.println("Input:");
            firstNumber = scn.nextInt();
            
        
        }
        scn.close();
    }

    static void gcf(int num1, int num2){
        int result = 0;
        while (num2 != 0) {
            result = num1 % num2;
            num1 = num2;
            num2 = result;
        }
        System.out.println(num1);
    }
}

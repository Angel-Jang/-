import java.util.Scanner;

public class JPA304 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double total = 0;
        int count = 0;

        System.out.print("Please enter meal in dollars or enter -1 to stop: ");
        int cost = scn.nextInt();

        while (cost != -1) {
            total += cost;
            count += 1;

            System.out.print("Please enter meal in dollars or enter -1 to stop: ");
            cost = scn.nextInt();
        }
        System.out.printf("餐點總費用: %.2f", total);
        System.out.println("");
        System.out.printf(count + " 道餐點平均費用為: %.2f", (total / count));
        System.out.println("");
        scn.close();
    }
}

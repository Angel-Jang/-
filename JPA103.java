import java.util.Scanner;

public class JPA103 {

    public static void main(String[] args) {
        System.out.println("Please input:");
        Scanner scn = new Scanner(System.in);
        byte x,y,z;

        x = scn.nextByte();
        y = scn.nextByte();
        z = scn.nextByte();

        System.out.printf("Average: %4.2f", ((float)(x+y+z)/3));
        System.out.println();
        scn.close();

    }
}
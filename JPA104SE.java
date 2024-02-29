import java.util.Scanner;
import java.awt.Point;

public class JPA104SE {

    public static void main(String[] args) {
        System.out.println("");
        Scanner scn = new Scanner(System.in);

        Point point1 = new Point(scn.nextInt(), scn.nextInt());
        Point point2 = new Point(scn.nextInt(), scn.nextInt());
        
        System.out.println(Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2)));
        scn.close();

    
    }
}
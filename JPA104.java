import java.util.Scanner;

public class JPA104 {

    public static void main(String[] args) {
        System.out.println("");
        Scanner scn = new Scanner(System.in);
        double x1,y1,x2,y2;
        
        x1 = scn.nextInt();
        y1 = scn.nextInt();
        x2 = scn.nextInt();
        y2 = scn.nextInt();
        
        System.out.println(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        scn.close();

    
    }
}
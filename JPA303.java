import java.util.ArrayList;

public class JPA303 {

    public static void main(String[] args) {
        ArrayList<Integer> perfect = new ArrayList<Integer>();
        for (int i = 1; i < 1000; i++) {
            int total = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    total += j;
                }    
            }
            if (total == i) {
                perfect.add(i);            
            }
        }
        System.out.println(perfect);
    }
}
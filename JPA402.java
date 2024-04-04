import java.util.Scanner;

public class JPA402 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    float total = 0;
    System.out.print("請輸入學生人數:");
    int students = scn.nextInt();
    float[] grades = new float[students];
    for (int i = 0; i < grades.length; i++) {
        System.out.print("第" + (i+1) + "個學生的成績:");
        float grade = scn.nextFloat();
        grades[i] = grade;
        total += grade;
    }
    System.out.println("人數:" + students);
    System.out.println("總分:" + total);
    System.out.println("平均:" + (total /students));
    scn.close();
    }
}
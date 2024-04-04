public class JPA405 {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        System.out.print("反轉陳列資料之前:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("");
        System.out.print("反轉陳列資料之後:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[(array.length-1) - i]);
        }
        System.out.println("");
    }
}

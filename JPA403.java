public class JPA403 {
    public static void main(String[] args) {
        int[][] arrayA = {{1, 2, 3}, {4, 5, 6}};
        int[][] arrayB = {{7, 8, 9}, {10, 11, 12}};
        System.out.println("陳列A的內容為(3x3):");
        System.out.printf("%3d%3d%3d", arrayA[0][0], arrayA[0][1], arrayA[0][2]);
        System.out.println("");
        System.out.printf("%3d%3d%3d", arrayA[1][0], arrayA[1][1], arrayA[1][2]);
        System.out.println("");
        System.out.println("陳列B的內容為(3x3):");
        System.out.printf("%3d%3d%3d", arrayB[0][0], arrayB[0][1], arrayB[0][2]);
        System.out.println("");
        System.out.printf("%3d%3d%3d", arrayB[1][0], arrayA[1][1], arrayB[1][2]);
        System.out.println("");
        System.out.println("陳列A+B=C, 陳列C的內容為(3x3):");
        System.out.printf("%3d%3d%3d", (arrayA[0][0] + arrayB[0][0]), (arrayA[0][1] + arrayB[0][1]), (arrayA[0][2] + arrayB[0][2]));
        System.out.println("");
        System.out.printf("%3d%3d%3d", (arrayA[1][0] + arrayB[1][0]), (arrayA[1][1] + arrayB[1][1]), (arrayA[1][2] + arrayB[1][2]));
        System.out.println("");
    }
}

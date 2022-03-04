import java.util.Arrays;

public class HackerRankTester {
    public static void main(String[] args) {
        // test case 1 (random)
        int[][] case1 = {{0, 1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5, 6},
                         {2, 3, 4, 5, 6, 7},
                         {3, 4, 5, 6, 7, 8},
                         {0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0}};
        int result = HackerRank.hourglassSumMax(case1);
        System.out.println("Calculated max: " + result);
        System.out.println("Expected max: 42");
        System.out.println("Expected sum list: ");
        System.out.println("14, 21, 28, 35,");
        System.out.println("21, 28, 35, 42,");
        System.out.println("13, 17, 21, 25,");
        System.out.println("12, 15, 18, 21");

        System.out.println();
        System.out.println("------------------------------");
        System.out.println();

        // test case 2 (given)
        int[][] case2 = {{-9, -9, -9, 1, 1, 1},
                         {0, -9, 0, 4, 3, 2},
                         {-9, -9, -9, 1, 2, 3},
                         {0, 0, 8, 6, 6, 0},
                         {0, 0, 0, -2, 0, 0},
                         {0, 0, 1, 2, 4, 0}};
        int max = HackerRank.hourglassSumMax(case2);
        System.out.println("Calculated max: " + max);
        System.out.println("Expected max: 28");
        System.out.println("Expected sum list: ");
        System.out.println("-63, -34, -9, 12,");
        System.out.println("-10, 0, 28, 23,");
        System.out.println("-27, -11, -2, 10,");
        System.out.println("9, 17, 25, 18");
    }
}

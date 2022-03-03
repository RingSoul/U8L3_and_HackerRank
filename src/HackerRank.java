public class HackerRank {
    public static int hourglassSumMax(int[][] arr) {
        int[] hourglassSum = new int[16];
        int indexToAdd = 0;
        for (int r = 1; r < arr.length - 1; r++)
        {
            for (int c = 1; c < arr[0].length - 1; c++)
            {
                int currentSum = 0;
                currentSum += arr[r][c]; // middle
                currentSum += arr[r-1][c-1]; // top left
                currentSum += arr[r-1][c]; // top
                currentSum += arr[r-1][c+1]; // top right
                currentSum += arr[r+1][c-1]; // bottom left
                currentSum += arr[r+1][c]; // bottom
                currentSum += arr[r+1][c+1]; // bottom right
                hourglassSum[indexToAdd] = currentSum;
                indexToAdd++;
                System.out.print(currentSum + " "); // testing
            }
            System.out.println(); // testing
        }
        int max = hourglassSum[0];
        for (int i = 1; i < hourglassSum.length; i++)
        {
            if (max < hourglassSum[i])
            {
                max = hourglassSum[i];
            }
        }
        return max;
    }
}

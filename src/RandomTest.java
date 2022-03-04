public class RandomTest {
    public static void main(String[] args) {
        String test = "sing the song";
        try {
            System.out.println(test.substring(test.length() + 1));
        } catch (IndexOutOfBoundsException x) {
            System.out.println(x.getMessage());
        }
    }
}

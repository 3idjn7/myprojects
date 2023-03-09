import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        String[] words = splitText(text);
        System.out.println("Original Text: " + text);
        System.out.println("Words: " + Arrays.toString(words));
    }

    public static String[] splitText(String text) {
        return text.split("\\s+");
    }
}
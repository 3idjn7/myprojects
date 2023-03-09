import java.util.Arrays;

public class Main {

    public static String[] splitIntoWords (String text) {
        return text.split("\\s");
    }
    public static void main(String[] args) {
        String text = "Never gonna give you up, never gonna let you down, never gonna run around and desert you";
        String[] words = splitIntoWords(text);
        System.out.println(Arrays.toString(words));
    }
}
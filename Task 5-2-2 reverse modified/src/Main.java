public class Main {

    public static String reverseText(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String text = "Never gonna give you up, never gonna let you down, never gonna run around and desert you";
        String reversedText = reverseText(text);
        System.out.println(reversedText);

    }
}
public class Main {
    public static void main(String[] args) {
        String text = "Was it a car or a cat I saw?";
        String reversedText = reverseText(text);
        System.out.println("Original Text: " + text);
        System.out.println("Reversed Text: " + reversedText);
    }

    public static String reverseText(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        return sb.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        int count = findA(text);
        System.out.println("The count of 'a' in the text is: " + count);
    }

    public static int findA(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}
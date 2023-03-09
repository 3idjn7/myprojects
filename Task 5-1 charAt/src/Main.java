public class Main {
    public static void main(String[] args) {
        String text = "An \"example sentence\" is a sentence written to demonstrate usage of a particular word in context. An example sentence is invented by its writer to show how to use a particular word properly in writing. Such examples are placed following a given definition, to make it clear which definition they illustrate.";
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
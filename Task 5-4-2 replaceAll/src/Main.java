public class Main {

    public static String replaceAwithAA(String input) {
        return input.replaceAll("A", "AA");
    }

    public static void main(String[] args) {
        String text = "NEVER GONNA GIVE YOU UP, NEVER GONNA LET YOU DOWN, NEVER GONNA RUN AROUND AND DESERT YOU";
        String result = replaceAwithAA(text);
        System.out.println(result);

    }
}
public class Main {

    public static String buildNumberString(int N) {
        StringBuilder sb = new StringBuilder(); //creates new StringBuilder object
        sb.append("The numbers from 0-").append(N).append(" are"); //calls the append() method on the stringbuilder

        for (int i = 0; i<= N; i++) {  //loops through numbers from 0 to N
            sb.append(" ").append(i); //append space to each number
        }
        return sb.toString(); // returns the string representation of the builder object using the toString method
    }

    public static void main(String[] args) {
        String numberString = buildNumberString(25);
        System.out.println(numberString);
    }
}
package src.main.java.datatypes.string.sort;

public class Reverse {

    public static String execute(String input) {
        System.out.println("String Reverse Function Started: ");
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(input);
        stringBuilder.reverse();
        System.out.println("String value: " + input);
        System.out.println("String reverted: " + stringBuilder);
        return stringBuilder.toString();
    }
}

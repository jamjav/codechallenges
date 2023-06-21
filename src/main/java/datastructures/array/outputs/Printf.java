package src.main.java.datastructures.array.outputs;

public class Printf {

    public static void main(String[] args) {

        int x = 123;
        String c = "char";

        System.out.println("String Justify 15 spaces and Number leading Zero");
        System.out.printf("%-14s %03d %n", "valor", 55);

        /* Formatting Number. */
        System.out.printf("<%d> is not justified.%n", x);
        System.out.printf("<%5d> is right justified.%n", x);
        System.out.printf("<%-5d> is left-justified.%n", x);

        /* Formatting strings. */
        System.out.printf("'%s' is not justified.%n", c);
        System.out.printf("'%10s' is right-justified.%n", c);
        System.out.printf("'%-10s' is left-justified.%n", c);


    }
}

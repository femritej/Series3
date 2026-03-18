// This program demonstrates De Morgan's Law.

public class DeMorganExample {
    public static void main(String[] args) {

        int age = 10;

        // Version 1: Using NOT with AND
        if (!(age >= 13 && age <= 19)) {
            System.out.println("Not a teenager (using ! and &&)");
        }

        // Version 2: Using OR with negated conditions
        if (age < 13 || age > 19) {
            System.out.println("Not a teenager (using < and > with ||)");
        }
    }
}

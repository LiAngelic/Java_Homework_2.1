package author_uml;
import java.lang.*;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args) {
        String email;
        Author lika = new Author("Лика", "lika.eriomenko@gmail.com", 'ж' );
        System.out.println("\nemail: " + lika.getEmail());
        Scanner input = new Scanner(System.in);
        System.out.println("\nВведите email: ");
        email = input.next();
        lika.setEmail(email);
        System.out.println("\nНовый email: " + lika.getEmail());
    }
}

import db.ButikkService;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

public class Program {

    private final ButikkService butikkService;
    public Program(ButikkService butikkService) {
        this.butikkService = butikkService;
    }



   /* private void displayMainMenu() {
        System.out.println("1. Login");
        System.out.println("2. View products");
        System.out.println("3. View products");
        System.out.println("4. View orders");
        System.out.println("5. view customers");
        System.out.println("6. Add customers");
        System.out.println("7. Delete customers");
        System.out.println("8. Delete products");
        System.out.println("9. Exit");
    }*/
    private void Quit() {
        System.out.println("Bye!");
    }
}

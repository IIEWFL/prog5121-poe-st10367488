package prog5121.project;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Account {

    static String username = "";
    static String password = "";
    static String firstName = "";
    static String lastName = "";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Username:");
        username = input.nextLine();
        while (!Login.checkUserNameValid(username)) {
            System.out.println(Login.registerUser(username, password));
            System.out.println("Enter Username:");
            username = input.nextLine();
        }
        System.out.println("Enter Password:");
        password = input.nextLine();
        while (!Login.checkPasswordComplex(password)) {
            System.out.println(Login.registerUser(username, password));
            System.out.println("Enter Password:");
            password = input.nextLine();
        }
        System.out.println(Login.registerUser(username, password));
        System.out.println("Enter First Name:");
        firstName = input.nextLine();

        System.out.println("Enter Last Name:");
        lastName = input.nextLine();

    }

    static void setUpClass() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}


import static java.time.Clock.system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class QuickChatRegistration1 {
    static Scanner scanner = new Scanner (System.in);

    private static boolean checkPasswordComplexity(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static boolean checkUserName(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    pubic static void registration(){
        System.out.println("--- Registraton ---");
        
        System.out.print("Enter first name");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        while(!checkUserName(username)){
            System.out.println("Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 charecters in length")
            system.out.print("Enter username again");
            username = scanner.nextLine(); 
        }
        System.out.print("Enter password");
        String password = scanner.nextLine();
        while (!checkPasswordComplexity(password)) {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            System.out.print("Enter password again: ");
            password = scanner.nextLine();
        }
        System.out.println("Password successfully captured.");
        
        System.out.print("Enter SA cell phone number (e.g.+27831234567): ");
        System.out.print("Enter cell phine number successfully added");
        String phone = scanner.nextLine();
    }
    System.out.println("cell phine number successfully added.");
    
QuickChatApp.registeredUser = new User(username, password, phone firstName ;) );   
}

public static boolean checkUserName(String username){
   return username.contains("_") && username.length() <= 5;
}

public static boolean checkPasswordComplexity(String password){
   return password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=]).{8,}$");

public static boolean checkCellPhoneNumber(String phone){
   return phone.matches("^\+27[0-9]{9}$");
}
}
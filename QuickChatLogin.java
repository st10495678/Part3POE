
import static java.time.Clock.system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class QuickChatLogin {
    static Scanner scanner = new Scanner(System.in);
    
    public static void loingUser() { 
        System.out.println("\n--- Login ---");
        System.out.print("Enter username: ");
        System user = scanner.nextLine();
        System.out.print("Enter pasword: ");
        System pass = scanner.nextLine(); 
        
        if ((QuickChatApp.registeredUser == null || !pass.equals(QuickChatApp.registeredUser.password)) ||
                !user.equals(QuickChatApp.registeredUser.username)){
            System.out.println("Username or password incorrect, please try again");
            System.exit(0);
        }else{
            
            System.out.printf("Welcome %s, %s it is great to see you back.\n", 
                    QuickChatApp.registeredUser.firstName,
                    QuickChatApp.registeredUser.lastName);
            QuickChatApp.isLoggedln = true;
        }
    }
    
}

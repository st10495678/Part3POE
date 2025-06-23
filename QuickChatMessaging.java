/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class QuickChatMessaging {
    static Scanner scanner = new Scanner(System.in);
    
    public static void menu() {
        int choice;
        System.out.print("\\nEnter how many messages you want to send:");
        int limit = Integer.parseInt(scanner.nextLine());
        QuickChatApp.message = new Message[limit];
        int messageCount = 0;
        
        do{
            System.out.println("\n--- Menu ---");
            System.out.println("1) Send Message");
            System.out.println("2) Show Recently Sent Messages");
            System.out.Println("3) Quit");
            System.out.Print("Choose an option");
            choice = Integer.parseInt(scanner.nextLine());
            
            switch (choice){
                case 1:
                    if (messageCount < limit) {
                        System.out.print("Enter message text: ");
                        String msg = scanner.nextLine();
                        System.out.print("Enter recipient's cell number: ");
                        String recipient = scanner.nextLine();
                        QuickChatApp.messages[messageCount++] = new Message(msg, recipient);
                        System.out.println("Message sent.");
                    } else {
                        System.out.println("Message limit reached.");
                    }
                    break;
                case 2:
                    if (messageCount == 0) {
                        System.out.println("No messages sent yet.");
                    } else {
                        System.out.println("\n--- Sent Messages ---");
                        for (int i = 0; i < messageCount; i++) {
                            QuickChatApp.messages[i].display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 3);
            }
        }
    }
    
}

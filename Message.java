
import static java.time.Clock.system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class Message {
    String text;
    String reciever;
    boolean sent;
    boolean received;
    private final boolean recieved;
    private String read;
            
public Message(String text, String receiver){
    this.text = text;
    this.reciever = receiver;
    this.sent = true;
    this.recieved = false;
}

public void display(){
    System.out.println("Message:" + text);
    System.out.println("to:" + reciever);
    System.out.println("Sent: " + sent);
    System.out.println("Received: " + received);
    System.out.println("Read: " + read);
    System.out.println("------------------------");
}
    
}

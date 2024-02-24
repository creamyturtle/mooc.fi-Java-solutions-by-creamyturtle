/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
 
import java.util.Objects;
import java.lang.*;
 
/**
 *
 * @author Skytech Shiva
 */
public class MessagingService {
    
          
    private ArrayList<Message> getMessages;
    
    
    public MessagingService() {
        this.getMessages = new ArrayList<>();
    }
    
    
    public void add(Message message) {
        
        if (message.getContent().length() <= 280) {
            this.getMessages.add(message);
        }
        
    }
    
    
    public ArrayList<Message> getMessages() {
        return this.getMessages;
    }
    
    /*
    public String getSender() {
        return sender;
    }
 
    public String getContent() {
        return content;
    }
 
    public String toString() {
        return this.sender + ": " + this.content;
    }
 
    // created using the "insert code" feature of NetBeans
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MessagingService other = (MessagingService) obj;
        if (!Objects.equals(this.sender, other.sender)) {
            return false;
        }
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        return true;
        
    }
    */
    
}
 

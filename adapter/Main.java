package adapter;

import java.io.PrintWriter;
import java.io.Writer;

public class Main {

    public static void main(String[] args) {

        ContactManager contactManager = new ContactManager();

        // add contacts to contact manager
        Contact contact1 = new Contact("Ethan", "Kerr", "801-608-6490", "ek@gmail.com");
        Contact contact2 = new Contact("Caitlin", "Kerr", "12345", "c@gmail.com");
        Contact contact3 = new Contact("John", "Bill", "890000", "j@gmail.com");
        Contact contact4 = new Contact("Bill", "Bob", "174827", "bb@gmail.com");
        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);
        contactManager.addContact(contact4);
        // put contact manager in adapter (adapter.TableContactManager)
        TableContactManager tableContactManager = new TableContactManager(contactManager);

        try{
            Writer output = new PrintWriter(System.out);
            Table table = new Table(output, tableContactManager);
            table.display();
            output.flush();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

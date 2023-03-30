package aula06;

import java.util.ArrayList;
import java.util.Scanner;
import aula05.*;

public class Contacto {
    private static Scanner input = new Scanner(System.in);
    private String id;
    private Pessoa pessoa;
    private String telefone;
    private String email;
    static ArrayList<Contacto> contactos = new ArrayList<Contacto>();

    public Contacto(String id, Pessoa pessoa, String telefone, String email) {
        this.id = id;
        this.pessoa = pessoa;
        this.telefone = telefone;
        this.email = email;

    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        // if (checkID(id))
            this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (checkTelefone(telefone))
            this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (checkEmail(email))
            this.email = email;
    }

    // public static boolean checkID(String id) {
    //     if (id.indexOf("-") != -1 || id.charAt(0) != 1) { // checks if the id is negative and if it starts with 1
    //         System.out.println(id);
    //         System.out.println("Must start with 1 and not be negative");
    //         return false;
    //     }
    //     return true;
    // }
   
    public static boolean checkTelefone(String telefone) {
        if (telefone.charAt(0) != 9) { // checks if the first digit is 9
            System.out.println("Must start with 9");
            return false;
        }
        if (telefone.length() != 9) { // checks if the length is 9
            System.out.println("Must have 9 digits");
            return false;
        }
        for (int i = 0; i < telefone.length(); i++) { // checks if all the characters are digits
            if (!Character.isDigit(telefone.charAt(i))) {
                System.out.println("Invalid phone number");
                return false;
            }
        }
        return true;
    }
    public static String askTelefone(){
        String telefone;
        boolean wrongTelefone = false;
        do {
            if (wrongTelefone)
                System.out.println("Invalid phone number try again");
            System.out.print("\tTelefone: ");
            telefone = input.next();
            wrongTelefone = true;
        } while (!checkTelefone(telefone));
        return telefone;
    }
    public static boolean checkEmail(String email) {
        if (email.indexOf("@") == -1) { // checks if there is an @
            System.out.println("Must have an @");
            return false;
        }
        if (email.indexOf(".pt") == -1 && email.indexOf(".com") == -1) { // checks if there is a .pt or .com
            System.out.println("Must end with .pt or .com");
            return false;
        }
        if (email.indexOf("@") > email.indexOf(".")) { // checks if the @ is before the .
            System.out.println("Invalid position of @ or .");
            return false;
        }

        return true;
    }
    public static String askEmail(){
        String email;
        boolean wrongEmail = false;
        do {
            if (wrongEmail)
                System.out.println("Invalid email try again");
            System.out.print("\tEmail: ");
            email = input.nextLine();
            wrongEmail = true;
        } while (!checkEmail(email));
        return email;
    }
    public static DateYMD askData() {
        int day, month, year;
        boolean wrongDate = false;
        do {
            if (wrongDate)
                System.out.println("Invalid date try again");
            System.out.print("\tDay: ");
            day = input.nextInt();

            System.out.print("\tMonth: ");
            month = input.nextInt();

            System.out.print("\tYear: ");
            year = input.nextInt();
            wrongDate = true;
        } while (!DateYMD.valid(day, month, year));
        DateYMD data = new DateYMD(day, month, year);
        return data;
    }

    public static String askID() {
        String id;
        // boolean wrongID = false;
        // do {
            // if (wrongID)
                // System.out.println("Invalid ID try again");
            System.out.print("ID: ");
            id = input.next();
            // wrongID = true;
        // } while (!checkID(id));
        return id;
    }

    public static void printMenu() {
        System.out.println("1. Inserir contacto");
        System.out.println("2. Alterar contacto");
        System.out.println("3. Apagar contacto");
        System.out.println("4. Procurar contacto");
        System.out.println("5. Listar contactos");
        System.out.println("0. Sair");
    }

    public static void main(String[] args) {
        boolean sair = false;
        contactos.add(new Contacto("1", new Pessoa("Joao", 123456789, new DateYMD(1,1,2000)), "912345678", "joao@gmail.com"));
        do{
        printMenu();
        System.out.print("Option: ");
        switch(input.nextInt()){
            case 0: 
                System.out.println("Bye!");
                sair = true;
                break;
            case 1:
               
                //name is checked
                String nome = Pessoa.askName();

                //cc is not checked beacuse it's commented in the askCC method
                int cc = Pessoa.askCC();

                //date is checked
                System.out.println("Birthday: ");
                aula05.DateYMD DataNasc = askData();

                //id is checked
                String id = askID();
                
                //phone is checked
                String telefone = askTelefone();

                //email is checked
                String email = askEmail();
                
                boolean contactoExistente = false;
                for (Contacto contacto : contactos) {
                    if (contacto.getID().equals(id)) {
                        contactoExistente = true;
                        System.out.println("Contacto já existe.\n Quer continuar? (s/n)");
                        if (input.nextLine().equals("s"));
                            contactos.add(new Contacto(id, new Pessoa(nome,cc, DataNasc), telefone, email));
                        break;
                    }
                }
                if (!contactoExistente) {
                    contactos.add(new Contacto(id, new Pessoa(nome,cc, DataNasc), telefone, email));
                }
                break;
            
                case 2:
                System.out.println("Enter the ID of the contact you want to modify: ");
                String idToModify = input.next();
                boolean contactFound = false;
                for (Contacto contacto2 : contactos) {
                    if (contacto2.getID().equals(idToModify)) {
                        System.out.println("Contact found: " + contacto2.getPessoa().getName());
                        System.out.println("Enter the new attributes for the contact:");
                        // name
                        String nome2 = Pessoa.askName();
                        contacto2.getPessoa().setName(nome2);
            
                        // cc
                        int cc2 = Pessoa.askCC();
                        contacto2.getPessoa().setCC(cc2);
            
                        // birthday
                        System.out.println("Birthday:");
                        aula05.DateYMD DataNasc2 = askData();
                        contacto2.getPessoa().setDataNasc(DataNasc2);
            
                        // id
                        System.out.println("ID:");
                        String id2 = input.next();
                        contacto2.setID(id2);
            
                        // phone number
                        System.out.println("Phone number:");
                        String telefone2 = input.next();
                        contacto2.setTelefone(telefone2);
            
                        // email
                        System.out.println("Email:");
                        String email2 = input.next();
                        contacto2.setEmail(email2);
            
                        System.out.println("Contact modified.");
                        contactFound = true;
                        break;
                    }
                }
                if (!contactFound) {
                    System.out.println("Contact not found.");
                }
                break;
            
            case 3:
                System.out.print("ID: ");
                String id3 = input.next();
                for (Contacto contacto3 : contactos) {
                    if (contacto3.getID() == id3) {
                        contactos.remove(contacto3);
                    }
                }
                break;
            case 4:
                System.out.print("ID: ");
                String id4 = input.next();
                for (Contacto contacto2 : contactos) {
                    if (contacto2.getID().equals(id4)) 
                        System.out.println("Contact found: " + contacto2.getPessoa().getName());
                }
                break;
            case 5:
                for (Contacto contacto5 : contactos) {
                    System.out.println(contacto5);
                }
                break;
            }

        }while(!sair);
    }

    @Override
    public String toString() {
        return "Contacto [ID = " + id + ", " + pessoa + ", Phone = " + telefone + ", Email = " + email + "]";
    }
}

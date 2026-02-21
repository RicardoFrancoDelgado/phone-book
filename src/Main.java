import com.ricardo.agenda.model.Contato;
import com.ricardo.agenda.service.PhoneBook;

class Main {
    public static void main(String[] args) {
        Contato c1 = new Contato("Ricardo", "21 91234-5678", "ricardo@email.com");

        PhoneBook app = new PhoneBook();

        try {
            app.addContact(new Contato("Ricardo", "21 91234-5678", "ricardo@email.com"));
            app.addContact(new Contato("Eduardo", "21 99876-5432", "eduardo@email.com"));
            app.addContact(new Contato("Ricardo", "21 91234-5678", "ricardo@email.com"));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
import java.util.Date;

public class Client {
    private Person person;
    private Date previousEnd;
    private Date newStart;

    public Client() {
        this.person = new Person();
        person.setOfficeAreaCode("123");
        person.setOfficeNumber("456");
        previousEnd = new Date(2013, 1, 1);
    }

    public String call_the_person() {
        return person.getTelephone().call();
    }

    public void newStart() {
        newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate()+1);
    }


}

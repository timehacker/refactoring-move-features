
public class Client {
    private Person person;

    public Client() {
        this.person = new Person();
        person.setOfficeAreaCode("123");
        person.setOfficeNumber("456");
    }

    public String call_the_person() {
        return person.getTelephone().call();
    }


}

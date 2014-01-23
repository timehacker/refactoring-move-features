import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    private Person person;

    @Before
    public void set_up() {
        person = new Person();
        person.setOfficeAreaCode("123");
        person.setOfficeNumber("456");
    }

    @Test
    public void should_get_correct_office_number_and_telephone_number() {
        Assert.assertEquals("456", person.getOfficeNumber());
        Assert.assertEquals("(123)456", person.getTelephoneNumber());
    }

    @Test
    public void should_call_correct_number() {
        Assert.assertEquals("CALL: (123)456", person.call());
    }
}

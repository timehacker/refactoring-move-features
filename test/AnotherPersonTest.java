import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnotherPersonTest {
    private AnotherPerson person;

    @Before
    public void set_up() {
        person = new AnotherPerson();
        person.setAnotherTelephoneNumber("123");
    }

    @Test
    public void should_call_another_telephone_number() {
        Assert.assertEquals("CALL: 123", person.callAnotherTelephoneNumber());
    }
}

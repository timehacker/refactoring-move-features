public class Person {
    private final TelephoneNumber telephoneNumber = new TelephoneNumber();
    private String _name;
    public String anotherTelephoneNumber;

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber.getTelephoneNumber();
    }

    public String call() {
        return telephoneNumber.call();
    }

    void setOfficeAreaCode(String code) {
        telephoneNumber.setOfficeAreaCode(code);
    }

    String getOfficeNumber() {
        return telephoneNumber.getOfficeNumber();
    }

    void setOfficeNumber(String number) {
        telephoneNumber.setOfficeNumber(number);
    }

    public void setAnotherTelephoneNumber(String number) {
        anotherTelephoneNumber = number;
    }

    public String getAnotherTelephoneNumber() {
        return anotherTelephoneNumber;
    }
}

public class Person {
    private final TelephoneNumber telephoneNumber = new TelephoneNumber();
    private String _name;

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber.getTelephoneNumber();
    }

    public TelephoneNumber getTelephone() {
        return telephoneNumber;
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
        telephoneNumber.setAnotherTelephoneNumber(number);
    }

    public String getAnotherTelephoneNumber() {
        return telephoneNumber.getAnotherTelephoneNumber();
    }
}

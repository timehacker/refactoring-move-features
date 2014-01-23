public class Person {
    private String _officeNumber;
    private String _officeAreaCode;
    private String _name;

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return ("(" + _officeAreaCode + ")" + _officeNumber);
    }

    public String call() {
        return "CALL: " + getTelephoneNumber();
    }

    void setOfficeAreaCode(String code) {
        _officeAreaCode = code;
    }

    String getOfficeNumber() {
        return _officeNumber;
    }

    void setOfficeNumber(String number) {
        _officeNumber = number;
    }

}

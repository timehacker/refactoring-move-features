public class TelephoneNumber {
    String _officeNumber;
    String _officeAreaCode;
    private String anotherTelephoneNumber;


    public TelephoneNumber() {
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

    public String getAnotherTelephoneNumber() {
        return anotherTelephoneNumber;
    }

    public void setAnotherTelephoneNumber(String anotherTelephoneNumber) {
        this.anotherTelephoneNumber = anotherTelephoneNumber;
    }
}
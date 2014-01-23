public class TelephoneNumber {
    String _officeNumber;
    String _officeAreaCode;

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
}
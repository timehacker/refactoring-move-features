import java.util.Date;

public class MfDate extends Date {
    public MfDate(Date arg) {
        super(arg.getTime());
    }
    
    public Date nextDay() {
        return new Date(getYear(), getMonth(), getDate()+1);
    }
}

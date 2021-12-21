import java.util.Date;

public class Transaction {
    public String  serieRef;
    public Date period;
    public double dataValue;
    public TransInfo information;
    public SerieTitles serieTitles;

    public Transaction(String serieRef, Date period, double dataValue,
                       String sup, String status, String unit, String magnitude, String subject, String group,
                       String t1, String t2, String t3, String t4, String t5){
        this.serieRef = serieRef;
        this.period = period;
        this.dataValue = dataValue;
        this.information = new TransInfo(sup, status, unit, magnitude, subject, group);
        this.serieTitles = new SerieTitles(t1, t2, t3, t4, t5);
    }
}
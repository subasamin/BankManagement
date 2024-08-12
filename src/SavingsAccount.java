import java.time.LocalDateTime;

public class SavingsAccount extends BankAccount {
    private double moneySaving;
    private String dateSent;
    private double interestRate;
    private int termSent;

    public SavingsAccount(int accountId, String accountCode, String accountName, String dateCreatAccount, double moneySaving, String dateSent, double interestRate, int termSent) {
        super(accountId, accountCode, accountName, dateCreatAccount);
        this.moneySaving = moneySaving;
        this.dateSent = dateSent;
        this.interestRate = interestRate;
        this.termSent = termSent;
    }

    public double getMoneySaving() {
        return moneySaving;
    }

    public void setMoneySaving(double moneySaving) {
        this.moneySaving = moneySaving;
    }

    public String getDateSent() {
        return dateSent;
    }

    public void setDateSent(String dateSent) {
        this.dateSent = dateSent;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTermSent() {
        return termSent;
    }

    public void setTermSent(int termSent) {
        this.termSent = termSent;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "moneySaving=" + moneySaving +
                ", dateSent='" + dateSent + '\'' +
                ", interestRate=" + interestRate +
                ", termSent=" + termSent +
                "} " + super.toString();
    }
}

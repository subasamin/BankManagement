import java.time.LocalDateTime;

public class PaymentAccount extends BankAccount{
    private int cardNumber;
    private double moneyInAccount;

    public PaymentAccount(int accountId, String accountCode, String accountName, String dateCreatAccount, int cardNumber, double moneyInAccount) {
        super(accountId, accountCode, accountName, dateCreatAccount);
        this.cardNumber = cardNumber;
        this.moneyInAccount = moneyInAccount;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getMoneyInAccount() {
        return moneyInAccount;
    }

    public void setMoneyInAccount(double moneyInAccount) {
        this.moneyInAccount = moneyInAccount;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" +
                "cardNumber=" + cardNumber +
                ", moneyInAccount=" + moneyInAccount +
                "} " + super.toString();
    }
}

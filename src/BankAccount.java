import java.time.LocalDateTime;

public abstract class BankAccount {
    private int accountId;
    private String accountCode;
    private String accountName;
    private String dateCreatAccount;

    public BankAccount(int accountId, String accountCode, String accountName, String dateCreatAccount) {
        this.accountId = accountId;
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.dateCreatAccount = dateCreatAccount;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDateCreatAccount() {
        return dateCreatAccount;
    }

    public void setDateCreatAccount(String dateCreatAccount) {
        this.dateCreatAccount = dateCreatAccount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", accountCode='" + accountCode + '\'' +
                ", accountName='" + accountName + '\'' +
                ", dateCreatAccount='" + dateCreatAccount + '\'' +
                '}';
    }
}

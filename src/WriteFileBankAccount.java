import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileBankAccount {
    public static void writeFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/data/bank_accounts.csv"));
            for (BankAccount account : CreateAccountBank.BankAccounts.values()) {
                if (account instanceof SavingsAccount) {
                    bw.append(Integer.toString(account.getAccountId()));
                    bw.append(',');
                    bw.append(account.getAccountCode());
                    bw.append(',');
                    bw.append(account.getAccountName());
                    bw.append(',');
                    bw.append(account.getDateCreatAccount());
                    bw.append(',');
                    bw.append(Double.toString(((SavingsAccount) account).getMoneySaving()));
                    bw.append(',');
                    bw.append(((SavingsAccount) account).getDateSent());
                    bw.append(',');
                    bw.append(Double.toString(((SavingsAccount) account).getInterestRate()));
                    bw.append(',');
                    bw.append(Integer.toString(((SavingsAccount) account).getTermSent()));
                    bw.append('\n');
                }
                else {
                    bw.append(Integer.toString(account.getAccountId()));
                    bw.append(',');
                    bw.append(account.getAccountCode());
                    bw.append(',');
                    bw.append(account.getAccountName());
                    bw.append(',');
                    bw.append(account.getDateCreatAccount());
                    bw.append(',');
                    bw.append(Integer.toString(((PaymentAccount) account).getCardNumber()));
                    bw.append(',');
                    bw.append(Double.toString(((PaymentAccount) account).getMoneyInAccount()));
                    bw.append('\n');
                }
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

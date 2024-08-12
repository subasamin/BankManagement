import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//public SavingsAccount(int accountId, String accountCode, String accountName, String dateCreatAccount, double moneySaving, String dateSent, double interestRate, int termSent) {

public class ReadFileAccountBank {
    public static void readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/data/bank_accounts.csv"));
            String line;
            List<String> list = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            for (int i = 0; i < list.size(); i++) {
                String[] parts = list.get(i).split(",");
                if (parts.length == 8) {
                    int accountId =Integer.parseInt(parts[0]) ;
                    String accountCode = parts[1];
                    String accountName = parts[2];
                    String dateCreatAccount = parts[3];
                    double moneySaving =Double.parseDouble(parts[4]);
                    String dateSent = parts[5];
                    double interestRate = Double.parseDouble(parts[6]);
                    int termsSent = Integer.parseInt(parts[7]);
                    SavingsAccount savingsAccount = new SavingsAccount(accountId,accountCode,accountName,dateCreatAccount,moneySaving,dateSent,interestRate,termsSent);
                    CreateAccountBank.BankAccounts.put(accountCode,savingsAccount);
                }
                else {
                    int accountId =Integer.parseInt(parts[0]) ;
                    String accountCode = parts[1];
                    String accountName = parts[2];
                    String dateCreatAccount = parts[3];
                    int cardName = Integer.parseInt(parts[4]);
                    double moneyInCard =Double.parseDouble(parts[5]);
                    PaymentAccount paymentAccount = new PaymentAccount(accountId,accountCode,accountName,dateCreatAccount,cardName,moneyInCard);
                    CreateAccountBank.BankAccounts.put(accountCode,paymentAccount);
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class CreateAccountBank {
    public static HashMap<String,BankAccount> BankAccounts = new HashMap<>();
    public static void createPaymentAccount() {
        Scanner scan = new Scanner(System.in);
        int accountId = BankAccounts.size()+1;
        System.out.println("Nhập mã tài khoản.");
        String accountCode = scan.nextLine();
        System.out.println("Nhập tên chủ tài khoản.");
        String accountName = scan.nextLine();
        System.out.println("Nhập ngày tạo tài khoản.");
        String dateCreate = scan.nextLine();
        System.out.println("Nhập số thẻ.");
        int numberCard = scan.nextInt();
        System.out.println("Nhập số tiền trong tài khoản.");
        double moneyInAccount = scan.nextDouble();
        BankAccount paymentAccount = new PaymentAccount(accountId,accountCode,accountName,dateCreate,numberCard,moneyInAccount);
        BankAccounts.put(accountCode,paymentAccount);
        WriteFileBankAccount.writeFile();
        ReadFileAccountBank.readFile();

    }
    public static void createSavingsAccount() {
        createSavings();

    }

    private static void createSavings() {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int accountId = BankAccounts.size()+1;
        System.out.println("Nhập mã tài khoản.");
        String accountCode = scan1.nextLine();
        System.out.println("Nhập tên chủ tài khoản.");
        String accountName = scan1.nextLine();
        System.out.println("Nhập ngày tạo tài khoản.");
        String dateCreate = scan1.nextLine();
        System.out.println("Nhập số tiền gửi tiết kiệm.");
        double moneySaving = scan1.nextDouble();
        System.out.println("Nhập ngày gửi tiết kiệm.");
        String dateSent = scan.nextLine();
        System.out.println("Nhập lãi xuất.");
        double interestRate = scan1.nextDouble();
        System.out.println("Nhập kỳ hạn gửi.");
        int termSent = scan1.nextInt();
        BankAccount savingAccout = new SavingsAccount(accountId,accountCode,accountName,dateCreate,moneySaving,dateSent,interestRate,termSent);
        BankAccounts.put(accountCode,savingAccout);
        WriteFileBankAccount.writeFile();
        ReadFileAccountBank.readFile();
    }

}

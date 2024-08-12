import java.util.Scanner;

public class DeleteBankAccount {
    public static void deleteBankAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã tài khoản ngân hàng cần xoá.");
        String accountCode = scanner.nextLine();
        if (CreateAccountBank.BankAccounts.containsKey(accountCode)){
            System.out.println("Bạn có muốn xoá tai khoản này không ?");
            System.out.println("Nhập Yes hoặc No.");
            String word = scanner.nextLine();
            if (word.equals("Yes")){
                CreateAccountBank.BankAccounts.remove(accountCode);
                WriteFileBankAccount.writeFile();
                System.out.println("Bạn đã xoá thành công với mã khách hàng"+word);
            }
            else if (word.equals("No")){
                Menu.menu();
            }
        }
    }
}

import java.util.Scanner;

public class FindAccount {
    public static void findAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã tài khoản cần tìm kiếm");
        String accountCode = scanner.nextLine();
        if (CreateAccountBank.BankAccounts.containsKey(accountCode)){
            System.out.println("Thông tin tài khoản vừa tìm kiếm là");
            System.out.println(CreateAccountBank.BankAccounts.get(accountCode));
        }
    }
}

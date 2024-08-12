import java.util.Scanner;

public class AccountBankManagement {
    public static void main(String[] args) {
        ReadFileAccountBank.readFile();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Chương trình quản lý tài khoản ngân hàng.");
            System.out.println("1.Thêm mới");
            System.out.println("2.Xoá");
            System.out.println("3.Xem danh sách các tài khoản ngân hàng");
            System.out.println("4.Tìm kiếm");
            System.out.println("5.Thoắt");
            System.out.println("Nhập vào một số để chọn chức năng.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    CreateAccountManagemrnt.menuCreateAccount();
                    break;
                case 2:
                    DeleteBankAccount.deleteBankAccount();
                    break;
                case 3:
                    DisplayAllBankAccount.displayAccount();
                    break;
                case 4:
                    FindAccount.findAccount();
                default:
                    System.out.println("Xin mời bạn nhập lại");
            }
        }
        while (true);
    }
}

import java.util.Scanner;

public class CreateAccountManagemrnt {
    public static void menuCreateAccount() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.Thêm tài khoản tiết kiệm");
            System.out.println("2.Thêm tài khoản thanh toán");
            System.out.println("3.Menu chính");
            System.out.println("Chọn một số để thực hiện yêu cầu");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    CreateAccountBank.createSavingsAccount();
                    break;
                case 2:
                    CreateAccountBank.createPaymentAccount();
                    break;
                case 3:
                    Menu.menu();
                    break;
                default:
                    System.out.println("Số không hợp lệ mời bạn nhập lại !");
            }
        }
        while (true);
    }
}

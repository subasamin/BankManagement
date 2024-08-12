public class DisplayAllBankAccount {
    public static void displayAccount(){
        for (BankAccount account: CreateAccountBank.BankAccounts.values()){
            if (account instanceof SavingsAccount){
                System.out.println("Thông tin tài khoản tiết kiệm là");
                System.out.println(account);
//                System.out.println(((SavingsAccount) account).getMoneySaving());
//                System.out.println(((SavingsAccount) account).getDateSent());
//                System.out.println(((SavingsAccount) account).getInterestRate());
//                System.out.println(((SavingsAccount) account).getTermSent());
            }
            else {
                System.out.println("Thông tin tài khoản thanh toán là");
                System.out.println(account);
//                System.out.println(((PaymentAccount) account).getCardNumber());
//                System.out.println(((PaymentAccount) account).getMoneyInAccount());
            }
        }
    }
}

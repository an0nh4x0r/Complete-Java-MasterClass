package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {
//        Bank bank = new Bank();
//        bank.setBalance(1000);
//        bank.depositBalance(3000);
//        bank.withdrawFunds(1500);
//
////        Bank bank1 = new Bank(12345, 4002.13,
////                "Swapnil Singh", "swappp7singh@gmail.com",
////                "8878805278");
//
//        Bank bank1 = new Bank();
//
//        System.out.println(bank1.getCustomerName());
//        System.out.println(bank1.getEmail());
//        System.out.println(bank1.getPhoneNumber());
//        System.out.println(bank1.getBalance());

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());

        VipCustomer vipCustomer1 = new VipCustomer("Harsh Bhatia", "theharshb@gmail.com");
        System.out.println(vipCustomer1.getCredit());

        VipCustomer vipCustomer2 = new VipCustomer("Alakshendra Singh Yadav", 300,
                "alakyadav@gmail.com");
        System.out.println(vipCustomer2.getEmailAddress());
    }
}

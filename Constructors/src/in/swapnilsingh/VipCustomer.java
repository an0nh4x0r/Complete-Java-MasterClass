package in.swapnilsingh;

public class VipCustomer {

    private String name;
    private double credit;
    private String emailAddress;

    public VipCustomer() {
        this("Swapnil Singh", 10000, "swappp7singh@gmail.com");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 100, emailAddress);
    }

    public VipCustomer(String name, double credit, String emailAddress) {
        this.name = name;
        this.credit = credit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

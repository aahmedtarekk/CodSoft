public interface ATM {
    public String withdraw(CreditCard C, double Balance);
    public String deposit(CreditCard C, double Balance);
    public String checkBalance(CreditCard C);
}

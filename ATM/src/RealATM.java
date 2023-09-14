public class RealATM implements ATM{
    @Override
    public String withdraw(CreditCard C, double Balance) {
        if(C.getBalance()>=Balance) {
            C.setBalance(C.getBalance() - Balance);
            return "Withdrawal went successfully!";
        }
        else
        {
            return "Insufficient Balance";
        }
    }

    @Override
    public String deposit(CreditCard C, double Balance) {
        C.setBalance(C.getBalance() + Balance);
        return "Transaction went successfully";
    }

    @Override
    public String checkBalance(CreditCard C) {

        return ("Current balance is " + C.getBalance());
    }
}

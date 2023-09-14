public class CreditCard {
    private int daysTillExpiry;
    private double Balance;
    public CreditCard(int Balance)
    {
        this.Balance=Balance;
    }
    public void setDaysTillExpiry(int daysTillExpiry) {
        this.daysTillExpiry = daysTillExpiry;
    }
    public int getDaysTillExpiry() {
        return daysTillExpiry;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
}

package work;

public class Transaction {
    private int amt;
    private String currency;

    public Transaction(int amt, String currency) {
        this.amt = amt;
        this.currency = currency;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmt() {
        return amt;
    }

    public String getCurrency() {
        return currency;
    }
}

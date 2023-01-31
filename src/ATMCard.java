package src;

public class ATMCard {
    private string CustomerName = null;
    private int CardNumber = Integer.parseInt(null);
    private int CVV = Integer.parseInt(null);
    private string UID = null;
    private int Validity = Integer.parseInt(null);
    private string BankInfo = null;
    private int PIN = Integer.parseInt(null);

    public ATMCard(string CustomerName, int CardNumber, int CVV, string UID, int Validity, string BankInfo, int PIN){
        this.CustomerName = CustomerName;
        this.CardNumber = CardNumber;
        this.CVV = CVV;
        this.UID = UID;
        this.Validity = Validity;
        this.BankInfo = BankInfo;
        this.PIN = PIN;
    }
}
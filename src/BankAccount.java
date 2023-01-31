package src;

public class BankAccount {
    private string BankName = null;
    private string BankInfo = null;

    public BankAccount(string BankName, string BankInfo){
        this.BankName = BankName;
        this.BankInfo = BankInfo;
    }

    public boolean AuthenticateCard(ATMCard atmCard){
        return false;
    }

    public string AccountInfo(ATMCard atmCard){
        return null;
    }

    public boolean UpdatePin(ATMCard atmCard, int newPIN){
        return false;
    }
    public boolean WithdrawalRequest(ATMCard atmCard, Cash cash){
        return false;
    }
    public boolean DepositRequest(ATMCard atmCard, Cash cash){
        return false;
    }

}

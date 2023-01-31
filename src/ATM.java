package src;

public class ATM {

    private final CardInsertBox cardInsertBox;
    private BankAccount bankAccount;
    private MoneyDepositWithdrawBox moneyDepositWithdawBox;
    private ReceiptBox receiptBox;

    public ATM() {
        this.cardInsertBox = new CardInsertBox();
        this.bankAccount = null;
        this.moneyDepositWithdawBox = new MoneyDepositWithdrawBox();
        this.receiptBox = new ReceiptBox();
    }

}

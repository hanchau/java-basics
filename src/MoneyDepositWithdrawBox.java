package src;

public class MoneyDepositWithdrawBox {
    private CashPool cashPool;
    private CashProcessingUnit cashProcessingUnit;

    public MoneyDepositWithdrawBox() {
        this.cashPool =new CashPool();
        this.cashProcessingUnit =new CashProcessingUnit();
    }

    public boolean OpenBox(){
        return false;
    }
    public boolean ValidateCash(Cash cash){
        return false;
    }
    public Cash RetrieveCash(Cash cash){
        return null;
    }
    public boolean CloseBox(){
        return false;
    }
}

package src;

public class CardInsertBox {

    private ATMCard atmCard;
    public CardInsertBox(){
        this.atmCard = null;
    }
    public boolean AllowInsertCard(){
        return false;
    }
    public boolean ValidateCard(BankAccount bankAccount,ATMCard atmCard){
        this.atmCard = atmCard;
        return false;
    }
    public boolean LockOnInsertCard(){
        return false;
    }
    public ATMCard ReturnCard(){
        return null;
    }

}
